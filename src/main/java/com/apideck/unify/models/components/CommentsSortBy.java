/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * CommentsSortBy - The field on which to sort the Comments
 */
public enum CommentsSortBy {
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at");

    @JsonValue
    private final String value;

    private CommentsSortBy(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<CommentsSortBy> fromValue(String value) {
        for (CommentsSortBy o: CommentsSortBy.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
