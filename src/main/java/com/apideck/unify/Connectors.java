/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify;

import com.apideck.unify.models.components.ConnectorsFilter;
import com.apideck.unify.models.components.GetConnectorResponse;
import com.apideck.unify.models.components.GetConnectorsResponse;
import com.apideck.unify.models.components.UnexpectedErrorResponse;
import com.apideck.unify.models.errors.APIException;
import com.apideck.unify.models.errors.BadRequestResponse;
import com.apideck.unify.models.errors.NotFoundResponse;
import com.apideck.unify.models.errors.PaymentRequiredResponse;
import com.apideck.unify.models.errors.UnauthorizedResponse;
import com.apideck.unify.models.operations.ConnectorConnectorsAllRequest;
import com.apideck.unify.models.operations.ConnectorConnectorsAllRequestBuilder;
import com.apideck.unify.models.operations.ConnectorConnectorsAllResponse;
import com.apideck.unify.models.operations.ConnectorConnectorsOneRequest;
import com.apideck.unify.models.operations.ConnectorConnectorsOneRequestBuilder;
import com.apideck.unify.models.operations.ConnectorConnectorsOneResponse;
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
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;
import com.jayway.jsonpath.ReadContext;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Long;
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
import org.openapitools.jackson.nullable.JsonNullable;

public class Connectors implements
            MethodCallConnectorConnectorsAll,
            MethodCallConnectorConnectorsOne {

    private final SDKConfiguration sdkConfiguration;

    Connectors(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List Connectors
     * 
     * <p>List Connectors
     * 
     * @return The call builder
     */
    public ConnectorConnectorsAllRequestBuilder list() {
        return new ConnectorConnectorsAllRequestBuilder(this);
    }

    /**
     * List Connectors
     * 
     * <p>List Connectors
     * 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ConnectorConnectorsAllResponse listDirect() throws Exception {
        return list(Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    /**
     * List Connectors
     * 
     * <p>List Connectors
     * 
     * @param appId The ID of your Unify application
     * @param cursor Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
     * @param limit Number of results to return. Minimum 1, Maximum 200, Default 20
     * @param filter 
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ConnectorConnectorsAllResponse list(
            Optional<String> appId,
            JsonNullable<String> cursor,
            Optional<Long> limit,
            Optional<? extends ConnectorsFilter> filter,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        ConnectorConnectorsAllRequest request =
            ConnectorConnectorsAllRequest
                .builder()
                .appId(appId)
                .cursor(cursor)
                .limit(limit)
                .filter(filter)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/connector/connectors");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ConnectorConnectorsAllRequest.class,
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
        _statusCodes.add("408");
        _statusCodes.add("500");
        _statusCodes.add("502");
        _statusCodes.add("503");
        _statusCodes.add("504");
        Retries _retries = Retries.builder()
            .action(() -> {
                HttpRequest _r = null;
                try {
                    _r = sdkConfiguration.hooks()
                        .beforeRequest(
                            new BeforeRequestContextImpl(
                                _baseUrl,
                                "connector.connectorsAll", 
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
                                _baseUrl,
                                "connector.connectorsAll",
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
                          _baseUrl,
                         "connector.connectorsAll", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        byte[] _fullResponse = Utils.extractByteArrayFromBody(_httpRes);
        
        @SuppressWarnings("deprecation")
        ConnectorConnectorsAllResponse.Builder _resBuilder = 
            ConnectorConnectorsAllResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes)
                .next(() -> {
                    if (request == null) {
                        return Optional.empty();
                    }
                    String _stringBody = new String(_fullResponse, StandardCharsets.UTF_8);
                    Configuration _config = Configuration.defaultConfiguration()
                            .addOptions(Option.SUPPRESS_EXCEPTIONS);
                    ReadContext _body = JsonPath.using(_config).parse(_stringBody);
                    String _nextCursor = _body.read("$.meta.cursors.next", String.class);
                    if (_nextCursor == null) {
                        return Optional.empty();
                    } 
                    ConnectorConnectorsAllRequestBuilder _nextRequest = list()
                            .appId(appId)
                            .cursor(_nextCursor)
                            .limit(limit)
                            .filter(filter);
                    return Optional.of(_nextRequest.call());
                });

        ConnectorConnectorsAllResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetConnectorsResponse _out = Utils.mapper().readValue(
                    new String(_fullResponse, StandardCharsets.UTF_8),
                    new TypeReference<GetConnectorsResponse>() {});
                _res.withGetConnectorsResponse(Optional.ofNullable(_out));
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



    /**
     * Get Connector
     * 
     * <p>Get Connector
     * 
     * @return The call builder
     */
    public ConnectorConnectorsOneRequestBuilder get() {
        return new ConnectorConnectorsOneRequestBuilder(this);
    }

    /**
     * Get Connector
     * 
     * <p>Get Connector
     * 
     * @param id ID of the record you are acting upon.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ConnectorConnectorsOneResponse get(
            String id) throws Exception {
        return get(Optional.empty(), id, Optional.empty());
    }
    
    /**
     * Get Connector
     * 
     * <p>Get Connector
     * 
     * @param appId The ID of your Unify application
     * @param id ID of the record you are acting upon.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ConnectorConnectorsOneResponse get(
            Optional<String> appId,
            String id,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        ConnectorConnectorsOneRequest request =
            ConnectorConnectorsOneRequest
                .builder()
                .appId(appId)
                .id(id)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ConnectorConnectorsOneRequest.class,
                _baseUrl,
                "/connector/connectors/{id}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
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
        _statusCodes.add("408");
        _statusCodes.add("500");
        _statusCodes.add("502");
        _statusCodes.add("503");
        _statusCodes.add("504");
        Retries _retries = Retries.builder()
            .action(() -> {
                HttpRequest _r = null;
                try {
                    _r = sdkConfiguration.hooks()
                        .beforeRequest(
                            new BeforeRequestContextImpl(
                                _baseUrl,
                                "connector.connectorsOne", 
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
                                _baseUrl,
                                "connector.connectorsOne",
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
                          _baseUrl,
                         "connector.connectorsOne", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ConnectorConnectorsOneResponse.Builder _resBuilder = 
            ConnectorConnectorsOneResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ConnectorConnectorsOneResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetConnectorResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetConnectorResponse>() {});
                _res.withGetConnectorResponse(Optional.ofNullable(_out));
                return _res;
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
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
