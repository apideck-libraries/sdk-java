/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.apideck.unify.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * OAuthGrantType - OAuth grant type used by the connector. More info: https://oauth.net/2/grant-types
 */
public enum OAuthGrantType {
    AUTHORIZATION_CODE("authorization_code"),
    CLIENT_CREDENTIALS("client_credentials"),
    PASSWORD("password");

    @JsonValue
    private final String value;

    private OAuthGrantType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<OAuthGrantType> fromValue(String value) {
        for (OAuthGrantType o: OAuthGrantType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
