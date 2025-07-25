/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.models.components.ApisFilter;
import com.apideck.unify.models.operations.ConnectorApisAllRequest;
import com.apideck.unify.models.operations.ConnectorApisAllRequestBuilder;
import com.apideck.unify.models.operations.ConnectorApisAllResponse;
import com.apideck.unify.models.operations.ConnectorApisOneRequest;
import com.apideck.unify.models.operations.ConnectorApisOneRequestBuilder;
import com.apideck.unify.models.operations.ConnectorApisOneResponse;
import com.apideck.unify.operations.ConnectorApisAllOperation;
import com.apideck.unify.operations.ConnectorApisOneOperation;
import com.apideck.unify.utils.Options;
import java.lang.Exception;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class Apis {
    private final SDKConfiguration sdkConfiguration;

    Apis(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * List APIs
     * 
     * <p>List APIs
     * 
     * @return The call builder
     */
    public ConnectorApisAllRequestBuilder list() {
        return new ConnectorApisAllRequestBuilder(sdkConfiguration);
    }

    /**
     * List APIs
     * 
     * <p>List APIs
     * 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ConnectorApisAllResponse listDirect() throws Exception {
        return list(Optional.empty(), JsonNullable.undefined(), Optional.empty(),
            Optional.empty(), Optional.empty());
    }

    /**
     * List APIs
     * 
     * <p>List APIs
     * 
     * @param appId The ID of your Unify application
     * @param cursor Cursor to start from. You can find cursors for next/previous pages in the meta.cursors property of the response.
     * @param limit Number of results to return. Minimum 1, Maximum 200, Default 20
     * @param filter 
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ConnectorApisAllResponse list(
            Optional<String> appId, JsonNullable<String> cursor,
            Optional<Long> limit, Optional<? extends ApisFilter> filter,
            Optional<Options> options) throws Exception {
        ConnectorApisAllRequest request =
            ConnectorApisAllRequest
                .builder()
                .appId(appId)
                .cursor(cursor)
                .limit(limit)
                .filter(filter)
                .build();
        RequestOperation<ConnectorApisAllRequest, ConnectorApisAllResponse> operation
              = new ConnectorApisAllOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Get API
     * 
     * <p>Get API
     * 
     * @return The call builder
     */
    public ConnectorApisOneRequestBuilder get() {
        return new ConnectorApisOneRequestBuilder(sdkConfiguration);
    }

    /**
     * Get API
     * 
     * <p>Get API
     * 
     * @param id ID of the record you are acting upon.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ConnectorApisOneResponse get(String id) throws Exception {
        return get(Optional.empty(), id, Optional.empty());
    }

    /**
     * Get API
     * 
     * <p>Get API
     * 
     * @param appId The ID of your Unify application
     * @param id ID of the record you are acting upon.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ConnectorApisOneResponse get(
            Optional<String> appId, String id,
            Optional<Options> options) throws Exception {
        ConnectorApisOneRequest request =
            ConnectorApisOneRequest
                .builder()
                .appId(appId)
                .id(id)
                .build();
        RequestOperation<ConnectorApisOneRequest, ConnectorApisOneResponse> operation
              = new ConnectorApisOneOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

}
