/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * FeedStatus
 * 
 * <p>Current status of the bank feed.
 */
public enum FeedStatus {
    PENDING("pending"),
    REJECTED("rejected");

    @JsonValue
    private final String value;

    FeedStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<FeedStatus> fromValue(String value) {
        for (FeedStatus o: FeedStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

