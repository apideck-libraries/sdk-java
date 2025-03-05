/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.apideck.unify.models.components;
import com.apideck.unify.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * ConsumerMetadata - The metadata of the consumer. This is used to display the consumer in the sidebar. This is optional, but recommended.
 */

public class ConsumerMetadata {

    /**
     * The name of the account as shown in the sidebar.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_name")
    private Optional<String> accountName;

    /**
     * The name of the user as shown in the sidebar.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("user_name")
    private Optional<String> userName;

    /**
     * The email of the user as shown in the sidebar.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    /**
     * The avatar of the user in the sidebar. Must be a valid URL
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("image")
    private Optional<String> image;

    @JsonCreator
    public ConsumerMetadata(
            @JsonProperty("account_name") Optional<String> accountName,
            @JsonProperty("user_name") Optional<String> userName,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("image") Optional<String> image) {
        Utils.checkNotNull(accountName, "accountName");
        Utils.checkNotNull(userName, "userName");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(image, "image");
        this.accountName = accountName;
        this.userName = userName;
        this.email = email;
        this.image = image;
    }
    
    public ConsumerMetadata() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The name of the account as shown in the sidebar.
     */
    @JsonIgnore
    public Optional<String> accountName() {
        return accountName;
    }

    /**
     * The name of the user as shown in the sidebar.
     */
    @JsonIgnore
    public Optional<String> userName() {
        return userName;
    }

    /**
     * The email of the user as shown in the sidebar.
     */
    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    /**
     * The avatar of the user in the sidebar. Must be a valid URL
     */
    @JsonIgnore
    public Optional<String> image() {
        return image;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the account as shown in the sidebar.
     */
    public ConsumerMetadata withAccountName(String accountName) {
        Utils.checkNotNull(accountName, "accountName");
        this.accountName = Optional.ofNullable(accountName);
        return this;
    }

    /**
     * The name of the account as shown in the sidebar.
     */
    public ConsumerMetadata withAccountName(Optional<String> accountName) {
        Utils.checkNotNull(accountName, "accountName");
        this.accountName = accountName;
        return this;
    }

    /**
     * The name of the user as shown in the sidebar.
     */
    public ConsumerMetadata withUserName(String userName) {
        Utils.checkNotNull(userName, "userName");
        this.userName = Optional.ofNullable(userName);
        return this;
    }

    /**
     * The name of the user as shown in the sidebar.
     */
    public ConsumerMetadata withUserName(Optional<String> userName) {
        Utils.checkNotNull(userName, "userName");
        this.userName = userName;
        return this;
    }

    /**
     * The email of the user as shown in the sidebar.
     */
    public ConsumerMetadata withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * The email of the user as shown in the sidebar.
     */
    public ConsumerMetadata withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * The avatar of the user in the sidebar. Must be a valid URL
     */
    public ConsumerMetadata withImage(String image) {
        Utils.checkNotNull(image, "image");
        this.image = Optional.ofNullable(image);
        return this;
    }

    /**
     * The avatar of the user in the sidebar. Must be a valid URL
     */
    public ConsumerMetadata withImage(Optional<String> image) {
        Utils.checkNotNull(image, "image");
        this.image = image;
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
        ConsumerMetadata other = (ConsumerMetadata) o;
        return 
            Objects.deepEquals(this.accountName, other.accountName) &&
            Objects.deepEquals(this.userName, other.userName) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.image, other.image);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accountName,
            userName,
            email,
            image);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ConsumerMetadata.class,
                "accountName", accountName,
                "userName", userName,
                "email", email,
                "image", image);
    }
    
    public final static class Builder {
 
        private Optional<String> accountName = Optional.empty();
 
        private Optional<String> userName = Optional.empty();
 
        private Optional<String> email = Optional.empty();
 
        private Optional<String> image = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the account as shown in the sidebar.
         */
        public Builder accountName(String accountName) {
            Utils.checkNotNull(accountName, "accountName");
            this.accountName = Optional.ofNullable(accountName);
            return this;
        }

        /**
         * The name of the account as shown in the sidebar.
         */
        public Builder accountName(Optional<String> accountName) {
            Utils.checkNotNull(accountName, "accountName");
            this.accountName = accountName;
            return this;
        }

        /**
         * The name of the user as shown in the sidebar.
         */
        public Builder userName(String userName) {
            Utils.checkNotNull(userName, "userName");
            this.userName = Optional.ofNullable(userName);
            return this;
        }

        /**
         * The name of the user as shown in the sidebar.
         */
        public Builder userName(Optional<String> userName) {
            Utils.checkNotNull(userName, "userName");
            this.userName = userName;
            return this;
        }

        /**
         * The email of the user as shown in the sidebar.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        /**
         * The email of the user as shown in the sidebar.
         */
        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * The avatar of the user in the sidebar. Must be a valid URL
         */
        public Builder image(String image) {
            Utils.checkNotNull(image, "image");
            this.image = Optional.ofNullable(image);
            return this;
        }

        /**
         * The avatar of the user in the sidebar. Must be a valid URL
         */
        public Builder image(Optional<String> image) {
            Utils.checkNotNull(image, "image");
            this.image = image;
            return this;
        }
        
        public ConsumerMetadata build() {
            return new ConsumerMetadata(
                accountName,
                userName,
                email,
                image);
        }
    }
}

