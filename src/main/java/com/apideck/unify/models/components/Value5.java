/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.apideck.unify.models.components;
import com.apideck.unify.utils.OneOfDeserializer;
import com.apideck.unify.utils.TypedObject;
import com.apideck.unify.utils.Utils.JsonShape;
import com.apideck.unify.utils.Utils.TypeReferenceWithShape;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;

@JsonDeserialize(using = Value5._Deserializer.class)
public class Value5 {

    @JsonValue
    private TypedObject value;
    
    private Value5(TypedObject value) {
        this.value = value;
    }

    public static Value5 of(String value) {
        Utils.checkNotNull(value, "value");
        return new Value5(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static Value5 of(long value) {
        Utils.checkNotNull(value, "value");
        return new Value5(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Long>(){}));
    }

    public static Value5 of(double value) {
        Utils.checkNotNull(value, "value");
        return new Value5(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Double>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.lang.String}</li>
     * <li>{@code long}</li>
     * <li>{@code double}</li>
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
        Value5 other = (Value5) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<Value5> {

        public _Deserializer() {
            super(Value5.class, false,
                  TypeReferenceWithShape.of(new TypeReference<Double>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<Long>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<String>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(Value5.class,
                "value", value);
    }
 
}
