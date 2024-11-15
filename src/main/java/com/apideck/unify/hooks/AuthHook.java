package com.apideck.unify.hooks;

import com.apideck.unify.utils.Helpers;
import com.apideck.unify.utils.Hook.BeforeRequest;
import com.apideck.unify.utils.Hook.BeforeRequestContext;

import java.net.http.HttpRequest;
import java.util.List;
import java.util.UUID;

public class AuthHook implements BeforeRequest {
    @Override
    public HttpRequest beforeRequest(BeforeRequestContext context, HttpRequest request) throws Exception {
        // modify the request object before it is sent, such as adding headers or query parameters
        // or throw an error to stop the request from being sent

        // Note that HttpRequest is immutable. With JDK 16 and later you can use
        // `HttpRequest.newBuilder(HttpRequest, BiPredicate<String, String>)` to copy the request
        // and modify it (the predicate is for filtering headers). If that method is not
        // available then use `Helpers.copy` in the generated `utils` package.
        String apiKey = request.headers().firstValue("Authorization")
            .orElse(""); // or .orElseThrow() if you want to enforce the header
        
        HttpRequest.Builder b = Helpers.copy(request);
        b.setHeader("Authorization", "Bearer " + apiKey);
        HttpRequest r = b.build();
        return r;
    }

}
