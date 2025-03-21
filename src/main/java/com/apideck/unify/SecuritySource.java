/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify;

import com.apideck.unify.utils.HasSecurity;

public interface SecuritySource {

    HasSecurity getSecurity();
    
    public static SecuritySource of(HasSecurity security) {
        return new DefaultSecuritySource(security);
    }

    public static class DefaultSecuritySource implements SecuritySource {
        private HasSecurity security;

        public DefaultSecuritySource(HasSecurity security) {
            this.security = security;
        }

        public HasSecurity getSecurity() {
            return security;
        }
    }
}
