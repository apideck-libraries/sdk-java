/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify;

import com.apideck.unify.models.components.GetCustomMappingsResponse;
import com.apideck.unify.models.components.UnexpectedErrorResponse;
import com.apideck.unify.models.errors.APIException;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.SDKMethodInterfaces.*;
import com.apideck.unify.models.operations.VaultConnectionCustomMappingsAllRequest;
import com.apideck.unify.models.operations.VaultConnectionCustomMappingsAllRequestBuilder;
import com.apideck.unify.models.operations.VaultConnectionCustomMappingsAllResponse;
import com.apideck.unify.utils.BackoffStrategy;
import com.apideck.unify.utils.HTTPClient;
import com.apideck.unify.utils.HTTPRequest;
import com.apideck.unify.utils.Hook.AfterErrorContextImpl;
import com.apideck.unify.utils.Hook.AfterSuccessContextImpl;
import com.apideck.unify.utils.Hook.BeforeRequestContextImpl;
import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.Retries.NonRetryableException;
import com.apideck.unify.utils.Retries;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit; 

public class ConnectionCustomMappings implements
            MethodCallVaultConnectionCustomMappingsAll {

    private final SDKConfiguration sdkConfiguration;

    ConnectionCustomMappings(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List connection custom mappings
     * This endpoint returns a list of custom mappings for a connection.
     * @return The call builder
     */
    public VaultConnectionCustomMappingsAllRequestBuilder list() {
        return new VaultConnectionCustomMappingsAllRequestBuilder(this);
    }

    /**
     * List connection custom mappings
     * This endpoint returns a list of custom mappings for a connection.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public VaultConnectionCustomMappingsAllResponse list(
            VaultConnectionCustomMappingsAllRequest request) throws Exception {
        return list(request, Optional.empty());
    }
    
    /**
     * List connection custom mappings
     * This endpoint returns a list of custom mappings for a connection.
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public VaultConnectionCustomMappingsAllResponse list(
            VaultConnectionCustomMappingsAllRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                VaultConnectionCustomMappingsAllRequest.class,
                _baseUrl,
                "/vault/connections/{unified_api}/{service_id}/{resource}/custom-mappings",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                VaultConnectionCustomMappingsAllRequest.class,
                request, 
                this.sdkConfiguration.globals));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HTTPRequest _finalReq = _req;
        RetryConfig _retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            _retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            _retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            _retryConfig = RetryConfig.builder()
                .backoff(BackoffStrategy.builder()
                            .initialInterval(500, TimeUnit.MILLISECONDS)
                            .maxInterval(60000, TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000, TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                .build();
        }
        List<String> _statusCodes = new ArrayList<>();
        _statusCodes.add("5XX");
        Retries _retries = Retries.builder()
            .action(() -> {
                HttpRequest _r = null;
                try {
                    _r = sdkConfiguration.hooks()
                        .beforeRequest(
                            new BeforeRequestContextImpl(
                                "vault.connectionCustomMappingsAll", 
                                Optional.of(List.of()), 
                                sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl(
                                "vault.connectionCustomMappingsAll",
                                 Optional.of(List.of()),
                                 sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl(
                         "vault.connectionCustomMappingsAll", 
                         Optional.of(List.of()), 
                         sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        VaultConnectionCustomMappingsAllResponse.Builder _resBuilder = 
            VaultConnectionCustomMappingsAllResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        VaultConnectionCustomMappingsAllResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetCustomMappingsResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetCustomMappingsResponse>() {});
                _res.withGetCustomMappingsResponse(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                BadRequestResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<BadRequestResponse>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                UnauthorizedResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<UnauthorizedResponse>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "402")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                PaymentRequiredResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<PaymentRequiredResponse>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "404")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                NotFoundResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<NotFoundResponse>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "422")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                UnprocessableResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<UnprocessableResponse>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "default")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                UnexpectedErrorResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<UnexpectedErrorResponse>() {});
                _res.withUnexpectedErrorResponse(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        throw new APIException(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}