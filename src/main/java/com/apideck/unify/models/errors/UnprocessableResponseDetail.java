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
 * UnprocessableResponseDetail - Contains parameter or domain specific information related to the error and why it occurred.
 */

@JsonDeserialize(using = UnprocessableResponseDetail._Deserializer.class)
public class UnprocessableResponseDetail {

    @JsonValue
    private TypedObject value;
    
    private UnprocessableResponseDetail(TypedObject value) {
        this.value = value;
    }

    public static UnprocessableResponseDetail of(String value) {
        Utils.checkNotNull(value, "value");
        return new UnprocessableResponseDetail(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static UnprocessableResponseDetail of(DetailUnprocessableResponse2 value) {
        Utils.checkNotNull(value, "value");
        return new UnprocessableResponseDetail(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DetailUnprocessableResponse2>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.lang.String}</li>
     * <li>{@code com.apideck.unify.models.errors.DetailUnprocessableResponse2}</li>
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
        UnprocessableResponseDetail other = (UnprocessableResponseDetail) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<UnprocessableResponseDetail> {

        public _Deserializer() {
            super(UnprocessableResponseDetail.class, false,
                  TypeReferenceWithShape.of(new TypeReference<String>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DetailUnprocessableResponse2>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(UnprocessableResponseDetail.class,
                "value", value);
    }
 
}