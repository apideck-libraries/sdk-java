package com.apideck.unify.hooks;

import com.posthog.java.PostHog;
import com.apideck.unify.utils.Hook.BeforeRequest;
import com.apideck.unify.utils.Hook.AfterError;
import com.apideck.unify.utils.Hook.AfterErrorContext;
import com.apideck.unify.utils.Hook.AfterSuccess;
import com.apideck.unify.utils.Hook.AfterSuccessContext;
import com.apideck.unify.utils.Hook.BeforeRequestContext;
import com.apideck.unify.utils.Hook.SdkInit;
import com.apideck.unify.utils.Hook.SdkInitData;

import java.io.InputStream;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Optional;

public final class Telemetry implements BeforeRequest, AfterError, AfterSuccess, SdkInit {
    private static PostHog posthog;
    private static final String POSTHOG_API_KEY = "phc_aLQ2VKrhS1arRkNAVLKMzep3Z9P4a4f86PlEkXsQ5Ym"; // Replace with your actual API key
    private static final String POSTHOG_HOST = "https://eu.i.posthog.com";

    public Telemetry() {
        posthog = new PostHog.Builder(POSTHOG_API_KEY)
            .host(POSTHOG_HOST)
            .build();
    }

    @Override
    public SdkInitData sdkInit(SdkInitData data) {
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("baseUrl", data.baseUrl());
        posthog.capture("sdk-customer-id-java", "sdk_init", properties);
        return new SdkInitData(data.baseUrl(), data.client());
    }

    @Override
    public HttpRequest beforeRequest(BeforeRequestContext context, HttpRequest request) {
        HashMap<String, Object> properties = new HashMap<>();
        // properties.put("method", request.method());
        // properties.put("uri", request.uri().toString());
        // properties.put("operationId", context.operationId());
        properties.put("foo", "bar");
        try {
            System.out.println("Debug - Request Method: " + request.method());
            System.out.println("Debug - Request URI: " + request.uri().toString());
            System.out.println("Debug - Operation ID: " + context.operationId());
        } catch (Exception e) {
            System.err.println("Failed to log request details: " + e.getMessage());
        }
        posthog.capture("sdk-customer-id-java", "before_request", properties);
        return request;
    }

    @Override
    public HttpResponse<InputStream> afterSuccess(AfterSuccessContext context, HttpResponse<InputStream> response) {
        HashMap<String, Object> properties = new HashMap<>();
        //properties.put("status_code", response.statusCode());
        properties.put("foo", "bar");
        posthog.capture("sdk-customer-id-java", "request_success", properties);
        this.shutdown();
        return response;
    }

    @Override
    public HttpResponse<InputStream> afterError(AfterErrorContext context, 
            Optional<HttpResponse<InputStream>> response, 
            Optional<Exception> error) {
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("foo", "bar");
        // response.ifPresent(r -> properties.put("status_code", r.statusCode()));
        // error.ifPresent(e -> properties.put("error_message", e.getMessage()));
        posthog.capture("sdk-customer-id-java", "request_error", properties);
        this.shutdown();
        return response.orElse(null);
    }

    public void shutdown() {
        if (posthog != null) {
            posthog.shutdown();
        }
    }
}