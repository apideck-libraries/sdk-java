/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import static com.apideck.unify.operations.Operations.RequestOperation;
import static com.apideck.unify.utils.Exceptions.unchecked;
import static com.apideck.unify.utils.Utils.transform;
import static com.apideck.unify.utils.Utils.toStream;

import com.apideck.unify.SDKConfiguration;
import com.apideck.unify.operations.IssueTrackingCollectionTicketCommentsOneOperation;
import com.apideck.unify.utils.Options;
import com.apideck.unify.utils.RetryConfig;
import com.apideck.unify.utils.Utils;
import com.apideck.unify.utils.pagination.CursorTracker;
import com.apideck.unify.utils.pagination.Paginator;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Iterable;
import java.lang.String;
import java.net.http.HttpResponse;
import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Stream;

public class IssueTrackingCollectionTicketCommentsOneRequestBuilder {

    private IssueTrackingCollectionTicketCommentsOneRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKConfiguration sdkConfiguration;

    public IssueTrackingCollectionTicketCommentsOneRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public IssueTrackingCollectionTicketCommentsOneRequestBuilder request(IssueTrackingCollectionTicketCommentsOneRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public IssueTrackingCollectionTicketCommentsOneRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public IssueTrackingCollectionTicketCommentsOneRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public IssueTrackingCollectionTicketCommentsOneResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<IssueTrackingCollectionTicketCommentsOneRequest, IssueTrackingCollectionTicketCommentsOneResponse> operation
              = new IssueTrackingCollectionTicketCommentsOneOperation(sdkConfiguration, options);

        return operation.handleResponse(operation.doRequest(request));
    }

    /**
    * Returns an iterable that performs next page calls till no more pages
    * are returned.
    *
    * <p>The returned iterable can be used in a for-each loop:
    * <pre><code>
    * for (IssueTrackingCollectionTicketCommentsOneResponse page : builder.callAsIterable()) {
    *     // Process each page
    * }
    * </code></pre>
    * 
    * @return An iterable that can be used to iterate through all pages
    */
    public Iterable<IssueTrackingCollectionTicketCommentsOneResponse> callAsIterable() {
        Optional<Options> options = Optional.of(Options.builder()
            .retryConfig(retryConfig)
            .build());

        RequestOperation<IssueTrackingCollectionTicketCommentsOneRequest, IssueTrackingCollectionTicketCommentsOneResponse> operation
              = new IssueTrackingCollectionTicketCommentsOneOperation(sdkConfiguration, options);
        Iterator<HttpResponse<InputStream>> iterator = new Paginator<>(
            request,
            new CursorTracker<>("$.meta.cursors.next", String.class),
                IssueTrackingCollectionTicketCommentsOneRequest::withCursor,
            nextRequest -> unchecked(() -> operation.doRequest(request)).get());
        
        return () -> transform(iterator, operation::handleResponse);
    }

    /**
     * Returns a stream that performs next page calls till no more pages
     * are returned.
     **/  
    public Stream<IssueTrackingCollectionTicketCommentsOneResponse> callAsStream() {
        return toStream(callAsIterable());
    }

}
