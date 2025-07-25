/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify;

import static com.apideck.unify.operations.Operations.RequestOperation;

import com.apideck.unify.models.operations.EcommerceProductsAllRequest;
import com.apideck.unify.models.operations.EcommerceProductsAllRequestBuilder;
import com.apideck.unify.models.operations.EcommerceProductsAllResponse;
import com.apideck.unify.models.operations.EcommerceProductsOneRequest;
import com.apideck.unify.models.operations.EcommerceProductsOneRequestBuilder;
import com.apideck.unify.models.operations.EcommerceProductsOneResponse;
import com.apideck.unify.operations.EcommerceProductsAllOperation;
import com.apideck.unify.operations.EcommerceProductsOneOperation;
import com.apideck.unify.utils.Options;
import java.lang.Exception;
import java.util.Optional;


public class Products {
    private final SDKConfiguration sdkConfiguration;

    Products(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * List Products
     * 
     * <p>List Products
     * 
     * @return The call builder
     */
    public EcommerceProductsAllRequestBuilder list() {
        return new EcommerceProductsAllRequestBuilder(sdkConfiguration);
    }

    /**
     * List Products
     * 
     * <p>List Products
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public EcommerceProductsAllResponse list(EcommerceProductsAllRequest request) throws Exception {
        return list(request, Optional.empty());
    }

    /**
     * List Products
     * 
     * <p>List Products
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public EcommerceProductsAllResponse list(EcommerceProductsAllRequest request, Optional<Options> options) throws Exception {
        RequestOperation<EcommerceProductsAllRequest, EcommerceProductsAllResponse> operation
              = new EcommerceProductsAllOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Get Product
     * 
     * <p>Get Product
     * 
     * @return The call builder
     */
    public EcommerceProductsOneRequestBuilder get() {
        return new EcommerceProductsOneRequestBuilder(sdkConfiguration);
    }

    /**
     * Get Product
     * 
     * <p>Get Product
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public EcommerceProductsOneResponse get(EcommerceProductsOneRequest request) throws Exception {
        return get(request, Optional.empty());
    }

    /**
     * Get Product
     * 
     * <p>Get Product
     * 
     * @param request The request object containing all the parameters for the API call.
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public EcommerceProductsOneResponse get(EcommerceProductsOneRequest request, Optional<Options> options) throws Exception {
        RequestOperation<EcommerceProductsOneRequest, EcommerceProductsOneResponse> operation
              = new EcommerceProductsOneOperation(sdkConfiguration, options);
        return operation.handleResponse(operation.doRequest(request));
    }

}
