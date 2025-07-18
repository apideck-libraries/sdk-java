/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.DeleteDriveGroupResponse;
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
import java.util.Optional;


public class FileStorageDriveGroupsDeleteResponse implements Response {
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
    private Optional<? extends DeleteDriveGroupResponse> deleteDriveGroupResponse;

    /**
     * Unexpected error
     */
    private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse;

    @JsonCreator
    public FileStorageDriveGroupsDeleteResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends DeleteDriveGroupResponse> deleteDriveGroupResponse,
            Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(deleteDriveGroupResponse, "deleteDriveGroupResponse");
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.deleteDriveGroupResponse = deleteDriveGroupResponse;
        this.unexpectedErrorResponse = unexpectedErrorResponse;
    }
    
    public FileStorageDriveGroupsDeleteResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse,
            Optional.empty(), Optional.empty());
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
    public Optional<DeleteDriveGroupResponse> deleteDriveGroupResponse() {
        return (Optional<DeleteDriveGroupResponse>) deleteDriveGroupResponse;
    }

    /**
     * Unexpected error
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<UnexpectedErrorResponse> unexpectedErrorResponse() {
        return (Optional<UnexpectedErrorResponse>) unexpectedErrorResponse;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * HTTP response content type for this operation
     */
    public FileStorageDriveGroupsDeleteResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public FileStorageDriveGroupsDeleteResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public FileStorageDriveGroupsDeleteResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * DriveGroups
     */
    public FileStorageDriveGroupsDeleteResponse withDeleteDriveGroupResponse(DeleteDriveGroupResponse deleteDriveGroupResponse) {
        Utils.checkNotNull(deleteDriveGroupResponse, "deleteDriveGroupResponse");
        this.deleteDriveGroupResponse = Optional.ofNullable(deleteDriveGroupResponse);
        return this;
    }


    /**
     * DriveGroups
     */
    public FileStorageDriveGroupsDeleteResponse withDeleteDriveGroupResponse(Optional<? extends DeleteDriveGroupResponse> deleteDriveGroupResponse) {
        Utils.checkNotNull(deleteDriveGroupResponse, "deleteDriveGroupResponse");
        this.deleteDriveGroupResponse = deleteDriveGroupResponse;
        return this;
    }

    /**
     * Unexpected error
     */
    public FileStorageDriveGroupsDeleteResponse withUnexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
        return this;
    }


    /**
     * Unexpected error
     */
    public FileStorageDriveGroupsDeleteResponse withUnexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
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
        FileStorageDriveGroupsDeleteResponse other = (FileStorageDriveGroupsDeleteResponse) o;
        return 
            Utils.enhancedDeepEquals(this.contentType, other.contentType) &&
            Utils.enhancedDeepEquals(this.statusCode, other.statusCode) &&
            Utils.enhancedDeepEquals(this.rawResponse, other.rawResponse) &&
            Utils.enhancedDeepEquals(this.deleteDriveGroupResponse, other.deleteDriveGroupResponse) &&
            Utils.enhancedDeepEquals(this.unexpectedErrorResponse, other.unexpectedErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            contentType, statusCode, rawResponse,
            deleteDriveGroupResponse, unexpectedErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FileStorageDriveGroupsDeleteResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "deleteDriveGroupResponse", deleteDriveGroupResponse,
                "unexpectedErrorResponse", unexpectedErrorResponse);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String contentType;

        private Integer statusCode;

        private HttpResponse<InputStream> rawResponse;

        private Optional<? extends DeleteDriveGroupResponse> deleteDriveGroupResponse = Optional.empty();

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
        public Builder deleteDriveGroupResponse(DeleteDriveGroupResponse deleteDriveGroupResponse) {
            Utils.checkNotNull(deleteDriveGroupResponse, "deleteDriveGroupResponse");
            this.deleteDriveGroupResponse = Optional.ofNullable(deleteDriveGroupResponse);
            return this;
        }

        /**
         * DriveGroups
         */
        public Builder deleteDriveGroupResponse(Optional<? extends DeleteDriveGroupResponse> deleteDriveGroupResponse) {
            Utils.checkNotNull(deleteDriveGroupResponse, "deleteDriveGroupResponse");
            this.deleteDriveGroupResponse = deleteDriveGroupResponse;
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

        public FileStorageDriveGroupsDeleteResponse build() {

            return new FileStorageDriveGroupsDeleteResponse(
                contentType, statusCode, rawResponse,
                deleteDriveGroupResponse, unexpectedErrorResponse);
        }

    }
}
