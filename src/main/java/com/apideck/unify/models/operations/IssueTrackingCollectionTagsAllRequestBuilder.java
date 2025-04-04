/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.errors.APIException;
import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import java.lang.Exception;
import java.util.Optional;
import java.util.stream.Stream;

public class IssueTrackingCollectionTagsAllRequestBuilder {

    private IssueTrackingCollectionTagsAllRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallIssueTrackingCollectionTagsAll sdk;

    public IssueTrackingCollectionTagsAllRequestBuilder(SDKMethodInterfaces.MethodCallIssueTrackingCollectionTagsAll sdk) {
        this.sdk = sdk;
    }

    public IssueTrackingCollectionTagsAllRequestBuilder request(IssueTrackingCollectionTagsAllRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public IssueTrackingCollectionTagsAllRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public IssueTrackingCollectionTagsAllRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public IssueTrackingCollectionTagsAllResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.list(
            request,
            options);
    }
    
    /**
     * Returns a stream that performs next page calls till no more pages
     * are returned. Unlike the {@link #call()} method this method will
     * throw an {@link APIException} if any page retrieval has an HTTP status 
     * code >= 300 (Note that 3XX is not an error range but will need 
     * special handling by the user if for example the HTTP client is 
     * not configured to follow redirects).
     * 
     * @throws {@link APIException} if HTTP status code >= 300 is encountered
     **/  
    public Stream<IssueTrackingCollectionTagsAllResponse> callAsStream() {
        return Utils.stream(() -> Optional.of(call()), x -> {
            if (x.statusCode() >= 300) {
                byte[] body = Utils.toByteArrayAndClose(x.rawResponse().body());
                throw new APIException(x.rawResponse(), x.statusCode(), x.contentType(), body);
            } else {
                return x.next();
            }
        });
    }
}
