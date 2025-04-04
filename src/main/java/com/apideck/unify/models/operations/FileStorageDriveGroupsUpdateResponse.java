/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.operations;

import com.apideck.unify.models.components.UnexpectedErrorResponse;
import com.apideck.unify.models.components.UpdateDriveGroupResponse;
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

public class FileStorageDriveGroupsUpdateResponse implements Response {

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
    private Optional<? extends UpdateDriveGroupResponse> updateDriveGroupResponse;

    /**
     * Unexpected error
     */
    private Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse;

    @JsonCreator
    public FileStorageDriveGroupsUpdateResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends UpdateDriveGroupResponse> updateDriveGroupResponse,
            Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(updateDriveGroupResponse, "updateDriveGroupResponse");
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.updateDriveGroupResponse = updateDriveGroupResponse;
        this.unexpectedErrorResponse = unexpectedErrorResponse;
    }
    
    public FileStorageDriveGroupsUpdateResponse(
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
    public Optional<UpdateDriveGroupResponse> updateDriveGroupResponse() {
        return (Optional<UpdateDriveGroupResponse>) updateDriveGroupResponse;
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
    public FileStorageDriveGroupsUpdateResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public FileStorageDriveGroupsUpdateResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public FileStorageDriveGroupsUpdateResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * DriveGroups
     */
    public FileStorageDriveGroupsUpdateResponse withUpdateDriveGroupResponse(UpdateDriveGroupResponse updateDriveGroupResponse) {
        Utils.checkNotNull(updateDriveGroupResponse, "updateDriveGroupResponse");
        this.updateDriveGroupResponse = Optional.ofNullable(updateDriveGroupResponse);
        return this;
    }

    /**
     * DriveGroups
     */
    public FileStorageDriveGroupsUpdateResponse withUpdateDriveGroupResponse(Optional<? extends UpdateDriveGroupResponse> updateDriveGroupResponse) {
        Utils.checkNotNull(updateDriveGroupResponse, "updateDriveGroupResponse");
        this.updateDriveGroupResponse = updateDriveGroupResponse;
        return this;
    }

    /**
     * Unexpected error
     */
    public FileStorageDriveGroupsUpdateResponse withUnexpectedErrorResponse(UnexpectedErrorResponse unexpectedErrorResponse) {
        Utils.checkNotNull(unexpectedErrorResponse, "unexpectedErrorResponse");
        this.unexpectedErrorResponse = Optional.ofNullable(unexpectedErrorResponse);
        return this;
    }

    /**
     * Unexpected error
     */
    public FileStorageDriveGroupsUpdateResponse withUnexpectedErrorResponse(Optional<? extends UnexpectedErrorResponse> unexpectedErrorResponse) {
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
        FileStorageDriveGroupsUpdateResponse other = (FileStorageDriveGroupsUpdateResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.updateDriveGroupResponse, other.updateDriveGroupResponse) &&
            Objects.deepEquals(this.unexpectedErrorResponse, other.unexpectedErrorResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            updateDriveGroupResponse,
            unexpectedErrorResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FileStorageDriveGroupsUpdateResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "updateDriveGroupResponse", updateDriveGroupResponse,
                "unexpectedErrorResponse", unexpectedErrorResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends UpdateDriveGroupResponse> updateDriveGroupResponse = Optional.empty();
 
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
        public Builder updateDriveGroupResponse(UpdateDriveGroupResponse updateDriveGroupResponse) {
            Utils.checkNotNull(updateDriveGroupResponse, "updateDriveGroupResponse");
            this.updateDriveGroupResponse = Optional.ofNullable(updateDriveGroupResponse);
            return this;
        }

        /**
         * DriveGroups
         */
        public Builder updateDriveGroupResponse(Optional<? extends UpdateDriveGroupResponse> updateDriveGroupResponse) {
            Utils.checkNotNull(updateDriveGroupResponse, "updateDriveGroupResponse");
            this.updateDriveGroupResponse = updateDriveGroupResponse;
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
        
        public FileStorageDriveGroupsUpdateResponse build() {
            return new FileStorageDriveGroupsUpdateResponse(
                contentType,
                statusCode,
                rawResponse,
                updateDriveGroupResponse,
                unexpectedErrorResponse);
        }
    }
}
