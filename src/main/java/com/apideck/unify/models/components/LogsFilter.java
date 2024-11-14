/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;


import com.apideck.unify.utils.SpeakeasyMetadata;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class LogsFilter {

    @SpeakeasyMetadata("queryParam:name=connector_id")
    private JsonNullable<String> connectorId;

    @SpeakeasyMetadata("queryParam:name=status_code")
    private JsonNullable<Double> statusCode;

    @SpeakeasyMetadata("queryParam:name=exclude_unified_apis")
    private JsonNullable<String> excludeUnifiedApis;

    @JsonCreator
    public LogsFilter(
            JsonNullable<String> connectorId,
            JsonNullable<Double> statusCode,
            JsonNullable<String> excludeUnifiedApis) {
        Utils.checkNotNull(connectorId, "connectorId");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(excludeUnifiedApis, "excludeUnifiedApis");
        this.connectorId = connectorId;
        this.statusCode = statusCode;
        this.excludeUnifiedApis = excludeUnifiedApis;
    }
    
    public LogsFilter() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    @JsonIgnore
    public JsonNullable<String> connectorId() {
        return connectorId;
    }

    @JsonIgnore
    public JsonNullable<Double> statusCode() {
        return statusCode;
    }

    @JsonIgnore
    public JsonNullable<String> excludeUnifiedApis() {
        return excludeUnifiedApis;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public LogsFilter withConnectorId(String connectorId) {
        Utils.checkNotNull(connectorId, "connectorId");
        this.connectorId = JsonNullable.of(connectorId);
        return this;
    }

    public LogsFilter withConnectorId(JsonNullable<String> connectorId) {
        Utils.checkNotNull(connectorId, "connectorId");
        this.connectorId = connectorId;
        return this;
    }

    public LogsFilter withStatusCode(double statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = JsonNullable.of(statusCode);
        return this;
    }

    public LogsFilter withStatusCode(JsonNullable<Double> statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    public LogsFilter withExcludeUnifiedApis(String excludeUnifiedApis) {
        Utils.checkNotNull(excludeUnifiedApis, "excludeUnifiedApis");
        this.excludeUnifiedApis = JsonNullable.of(excludeUnifiedApis);
        return this;
    }

    public LogsFilter withExcludeUnifiedApis(JsonNullable<String> excludeUnifiedApis) {
        Utils.checkNotNull(excludeUnifiedApis, "excludeUnifiedApis");
        this.excludeUnifiedApis = excludeUnifiedApis;
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
        LogsFilter other = (LogsFilter) o;
        return 
            Objects.deepEquals(this.connectorId, other.connectorId) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.excludeUnifiedApis, other.excludeUnifiedApis);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            connectorId,
            statusCode,
            excludeUnifiedApis);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LogsFilter.class,
                "connectorId", connectorId,
                "statusCode", statusCode,
                "excludeUnifiedApis", excludeUnifiedApis);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> connectorId = JsonNullable.undefined();
 
        private JsonNullable<Double> statusCode = JsonNullable.undefined();
 
        private JsonNullable<String> excludeUnifiedApis = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder connectorId(String connectorId) {
            Utils.checkNotNull(connectorId, "connectorId");
            this.connectorId = JsonNullable.of(connectorId);
            return this;
        }

        public Builder connectorId(JsonNullable<String> connectorId) {
            Utils.checkNotNull(connectorId, "connectorId");
            this.connectorId = connectorId;
            return this;
        }

        public Builder statusCode(double statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = JsonNullable.of(statusCode);
            return this;
        }

        public Builder statusCode(JsonNullable<Double> statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        public Builder excludeUnifiedApis(String excludeUnifiedApis) {
            Utils.checkNotNull(excludeUnifiedApis, "excludeUnifiedApis");
            this.excludeUnifiedApis = JsonNullable.of(excludeUnifiedApis);
            return this;
        }

        public Builder excludeUnifiedApis(JsonNullable<String> excludeUnifiedApis) {
            Utils.checkNotNull(excludeUnifiedApis, "excludeUnifiedApis");
            this.excludeUnifiedApis = excludeUnifiedApis;
            return this;
        }
        
        public LogsFilter build() {
            return new LogsFilter(
                connectorId,
                statusCode,
                excludeUnifiedApis);
        }
    }
}
