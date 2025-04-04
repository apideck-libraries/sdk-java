/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.CreateDriveGroupResponse;
import com.apideck.unify.models.components.UnexpectedErrorResponse;
import com.apideck.unify.utils.Response;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;

public class FileStorageDriveGroupsAddResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * DriveGroups
     */
    private Optional<? extends CreateDriveGroupResponse> createDriveGroupResponse;

    /**
     * Unexpected error
     */
    private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse;

    @JsonCreator
    public FileStorageDriveGroupsAddResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends CreateDriveGroupResponse> createDriveGroupResponse,
            Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(createDriveGroupResponse, "createDriveGroupResponse");
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.createDriveGroupResponse = createDriveGroupResponse;
        this.unexpectedErrorResponse = unexpectedErrorResponse;
    }
    
    public FileStorageDriveGroupsAddResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty(), Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * DriveGroups
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CreateDriveGroupResponse> createDriveGroupResponse() {
        return (Optional<CreateDriveGroupResponse>) createDriveGroupResponse;
    }

    /**
     * Unexpected error
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UnexpectedErrorResponse> unexpectedErrorResponse() {
        return (Optional<UnexpectedErrorResponse>) unexpectedErrorResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * HTTP response content type for this operation
     */
    public FileStorageDriveGroupsAddResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public FileStorageDriveGroupsAddResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public FileStorageDriveGroupsAddResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * DriveGroups
     */
    public FileStorageDriveGroupsAddResponse withCreateDriveGroupResponse(CreateDriveGroupResponse createDriveGroupResponse) {
        Utils.checkNotNull(createDriveGroupResponse, "createDriveGroupResponse");
        this.createDriveGroupResponse = Optional.ofNullable(createDriveGroupResponse);
        return this;
    }

    /**
     * DriveGroups
     */
    public FileStorageDriveGroupsAddResponse withCreateDriveGroupResponse(Optional<? extends CreateDriveGroupResponse> createDriveGroupResponse) {
        Utils.checkNotNull(createDriveGroupResponse, "createDriveGroupResponse");
        this.createDriveGroupResponse = createDriveGroupResponse;
        return this;
    }

    /**
     * Unexpected error
     */
    public FileStorageDriveGroupsAddResponse withUnexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
        return this;
    }

    /**
     * Unexpected error
     */
    public FileStorageDriveGroupsAddResponse withUnexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = unexpectedErrorResponse;
        return this;
    }

    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileStorageDriveGroupsAddResponse other = (FileStorageDriveGroupsAddResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.createDriveGroupResponse, other.createDriveGroupResponse) &&
            Objects.deepEquals(this.unexpectedErrorResponse, other.unexpectedErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            createDriveGroupResponse,
            unexpectedErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FileStorageDriveGroupsAddResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "createDriveGroupResponse", createDriveGroupResponse,
                "unexpectedErrorResponse", unexpectedErrorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends CreateDriveGroupResponse> createDriveGroupResponse = Optional.empty();
 
        private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * DriveGroups
         */
        public Builder createDriveGroupResponse(CreateDriveGroupResponse createDriveGroupResponse) {
            Utils.checkNotNull(createDriveGroupResponse, "createDriveGroupResponse");
            this.createDriveGroupResponse = Optional.ofNullable(createDriveGroupResponse);
            return this;
        }

        /**
         * DriveGroups
         */
        public Builder createDriveGroupResponse(Optional<? extends CreateDriveGroupResponse> createDriveGroupResponse) {
            Utils.checkNotNull(createDriveGroupResponse, "createDriveGroupResponse");
            this.createDriveGroupResponse = createDriveGroupResponse;
            return this;
        }

        /**
         * Unexpected error
         */
        public Builder unexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
            Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
            this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
            return this;
        }

        /**
         * Unexpected error
         */
        public Builder unexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
            Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
            this.unexpectedErrorResponse = unexpectedErrorResponse;
            return this;
        }
        
        public FileStorageDriveGroupsAddResponse build() {
            return new FileStorageDriveGroupsAddResponse(
                contentType,
                statusCode,
                rawResponse,
                createDriveGroupResponse,
                unexpectedErrorResponse);
        }
    }
}
