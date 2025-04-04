/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package com.apideck.unify.utils;

import java.lang.reflect.Field;

class SecurityMetadata {

    String type;
    String subtype;
    boolean option;
    boolean scheme;
    String name;

    private SecurityMetadata() {
    }

    // security:scheme=true,type=apiKey,subtype=header
    static SecurityMetadata parse(Field field) throws IllegalArgumentException, IllegalAccessException {
       return Metadata.parse("security", new SecurityMetadata(), field);
    }
}
