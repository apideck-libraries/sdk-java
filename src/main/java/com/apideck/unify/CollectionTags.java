/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify;

import com.apideck.unify.models.components.GetCollectionTagsResponse;
import com.apideck.unify.models.components.UnexpectedErrorResponse;
import com.apideck.unify.models.errors.APIException;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.errors.UnprocessableResponse;
import com.apideck.unify.models.operations.IssueTrackingCollectionTagsAllRequest;
import com.apideck.unify.models.operations.IssueTrackingCollectionTagsAllRequestBuilder;
import com.apideck.unify.models.operations.IssueTrackingCollectionTagsAllResponse;
import com.apideck.unify.models.operations.SDKMethodInterfaces.*;
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
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.ReadContext;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit; 

public class CollectionTags implements
            MethodCallIssueTrackingCollectionTagsAll {

    private final SDKConfiguration sdkConfiguration;

    CollectionTags(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List Tags
     * List Tags
     * @return The call builder
     */
    public IssueTrackingCollectionTagsAllRequestBuilder list() {
        return new IssueTrackingCollectionTagsAllRequestBuilder(this);
    }

    /**
     * List Tags
     * List Tags
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public IssueTrackingCollectionTagsAllResponse list(
            IssueTrackingCollectionTagsAllRequest request) throws Exception {
        return list(request, Optional.empty());
    }
    
    /**
     * List Tags
     * List Tags
     * @param request The request object containing all of the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public IssueTrackingCollectionTagsAllResponse list(
            IssueTrackingCollectionTagsAllRequest request,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                IssueTrackingCollectionTagsAllRequest.class,
                _baseUrl,
                "/issue-tracking/collections/{collection_id}/tags",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                IssueTrackingCollectionTagsAllRequest.class,
                request, 
                this.sdkConfiguration.globals));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
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
                                "issueTracking.collectionTagsAll", 
                                Optional.of(List.of()), 
                                _hookSecuritySource),
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
                                "issueTracking.collectionTagsAll",
                                 Optional.of(List.of()),
                                 _hookSecuritySource), 
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
                         "issueTracking.collectionTagsAll", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        byte[] _fullResponse = Utils.extractByteArrayFromBody(_httpRes);
        
        @SuppressWarnings("deprecation")
        IssueTrackingCollectionTagsAllResponse.Builder _resBuilder = 
            IssueTrackingCollectionTagsAllResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes)
                .next(() -> {
                    String _stringBody = new String(_fullResponse, StandardCharsets.UTF_8);
                    ReadContext _body = JsonPath.parse(_stringBody);

                    if (request == null) {
                        return Optional.empty();
                    }
                    
                    
                    
                    
                    
                    @SuppressWarnings("unchecked")
                    List<String> _nextCursorToken = _body.read("$.meta.cursors.next", List.class);
                    if (_nextCursorToken == null || _nextCursorToken.isEmpty()) {
                        return Optional.empty();
                    };

                    String _nextCursor = _nextCursorToken.get(0);

                    
                    
                    
                    
                     
                    IssueTrackingCollectionTagsAllRequestBuilder _ret = list();
                    _ret.request(new IssueTrackingCollectionTagsAllRequest(
                        request.collectionId(),
                        request.raw(),
                        request.consumerId(),
                        request.appId(),
                        request.serviceId(),
                        request.cursor(),
                        request.limit(),
                        request.passThrough(),
                        request.fields()
                    ));
                    return Optional.of(_ret.call());
                });

        IssueTrackingCollectionTagsAllResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetCollectionTagsResponse _out = Utils.mapper().readValue(
                    new String(_fullResponse, StandardCharsets.UTF_8),
                    new TypeReference<GetCollectionTagsResponse>() {});
                _res.withGetCollectionTagsResponse(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    _fullResponse);
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                BadRequestResponse _out = Utils.mapper().readValue(
                    new String(_fullResponse, StandardCharsets.UTF_8),
                    new TypeReference<BadRequestResponse>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    _fullResponse);
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                UnauthorizedResponse _out = Utils.mapper().readValue(
                    new String(_fullResponse, StandardCharsets.UTF_8),
                    new TypeReference<UnauthorizedResponse>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    _fullResponse);
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "402")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                PaymentRequiredResponse _out = Utils.mapper().readValue(
                    new String(_fullResponse, StandardCharsets.UTF_8),
                    new TypeReference<PaymentRequiredResponse>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    _fullResponse);
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "404")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                NotFoundResponse _out = Utils.mapper().readValue(
                    new String(_fullResponse, StandardCharsets.UTF_8),
                    new TypeReference<NotFoundResponse>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    _fullResponse);
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "422")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                UnprocessableResponse _out = Utils.mapper().readValue(
                    new String(_fullResponse, StandardCharsets.UTF_8),
                    new TypeReference<UnprocessableResponse>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    _fullResponse);
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    _fullResponse);
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    _fullResponse);
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "default")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                UnexpectedErrorResponse _out = Utils.mapper().readValue(
                    new String(_fullResponse, StandardCharsets.UTF_8),
                    new TypeReference<UnexpectedErrorResponse>() {});
                _res.withUnexpectedErrorResponse(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    _fullResponse);
            }
        }
        throw new APIException(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            _fullResponse);
    }

}
