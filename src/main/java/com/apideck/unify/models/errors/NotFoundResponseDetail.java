/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.models.errors;


import com.apideck.unify.utils.OneOfDeserializer;
import com.apideck.unify.utils.TypedObject;
import com.apideck.unify.utils.Utils.JsonShape;
import com.apideck.unify.utils.Utils.TypeReferenceWithShape;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * NotFoundResponseDetail - Contains parameter or domain specific information related to the error and why it occurred.
 */

@JsonDeserialize(using = NotFoundResponseDetail._Deserializer.class)
public class NotFoundResponseDetail {

    @JsonValue
    private TypedObject value;
    
    private NotFoundResponseDetail(TypedObject value) {
        this.value = value;
    }

    public static NotFoundResponseDetail of(String value) {
        Utils.checkNotNull(value, "value");
        return new NotFoundResponseDetail(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static NotFoundResponseDetail of(DetailNotFoundResponse2 value) {
        Utils.checkNotNull(value, "value");
        return new NotFoundResponseDetail(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DetailNotFoundResponse2>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.lang.String}</li>
     * <li>{@code com.apideck.unify.models.errors.DetailNotFoundResponse2}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotFoundResponseDetail other = (NotFoundResponseDetail) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<NotFoundResponseDetail> {

        public _Deserializer() {
            super(NotFoundResponseDetail.class, false,
                  TypeReferenceWithShape.of(new TypeReference<String>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DetailNotFoundResponse2>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(NotFoundResponseDetail.class,
                "value", value);
    }
 
}
