/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify.utils;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;

final class QueryEncoding {
    
    private static final int RADIX = 16;
    private static final char QUERY_PARAM_SEPARATOR = '&';
    private static final char PARAM_VALUE_SEPARATOR = '=';
    
    
    /////////////////////////////////
    // Query Encoding
    /////////////////////////////////

    private static final BitSet UNRESERVED = new BitSet(256);

    static {
        for (int i = 'a'; i <= 'z'; i++) {
            UNRESERVED.set(i);
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            UNRESERVED.set(i);
        }
        // numeric characters
        for (int i = '0'; i <= '9'; i++) {
            UNRESERVED.set(i);
        }
        UNRESERVED.set('-');
        UNRESERVED.set('.');
        UNRESERVED.set('_');
        UNRESERVED.set('~');
    }
    
    /**
     * Returns the encoded query string from the given parameters.
     * 
     * @param parameters query parameters
     * @param charset charset to apply for percent encoding
     * @param blankAsPlus set to true to encode a blank as a plus character
     * @return encoded query string
     */
    static String formatQuery(final Iterable<? extends NameValue> parameters,
            final Charset charset, final boolean blankAsPlus) {
        StringBuilder buf = new StringBuilder();
        int i = 0;
        for (final NameValue parameter : parameters) {
            if (i > 0) {
                buf.append(QUERY_PARAM_SEPARATOR);
            }
            percentEncode(buf, parameter.name(), charset, blankAsPlus);
            if (parameter.value() != null) {
                buf.append(PARAM_VALUE_SEPARATOR);
                percentEncode(buf, parameter.value(), charset, blankAsPlus);
            }
            i++;
        }
        return buf.toString();
    }

    private static void percentEncode(final StringBuilder buf, final CharSequence content, final Charset charset,
            final boolean blankAsPlus) {
        percentEncode(buf, content, charset, UNRESERVED, blankAsPlus);
    }

    private static void percentEncode(final StringBuilder buf, final CharSequence content, final Charset charset,
            final BitSet safechars, final boolean blankAsPlus) {
        if (content == null) {
            return;
        }
        final CharBuffer cb = CharBuffer.wrap(content);
        final ByteBuffer bb = (charset != null ? charset : StandardCharsets.UTF_8).encode(cb);
        while (bb.hasRemaining()) {
            final int b = bb.get() & 0xff;
            if (safechars.get(b)) {
                buf.append((char) b);
            } else if (blankAsPlus && b == ' ') {
                buf.append("+");
            } else {
                buf.append("%");
                final char hex1 = Character.toUpperCase(Character.forDigit((b >> 4) & 0xF, RADIX));
                final char hex2 = Character.toUpperCase(Character.forDigit(b & 0xF, RADIX));
                buf.append(hex1);
                buf.append(hex2);
            }
        }
    }
}
