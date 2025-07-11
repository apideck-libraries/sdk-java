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
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;


public class MessageInput {
    /**
     * The phone number that initiated the message.
     */
    @JsonProperty("from")
    private String from;

    /**
     * The phone number that received the message.
     */
    @JsonProperty("to")
    private String to;


    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subject")
    private Optional<String> subject;

    /**
     * The message text.
     */
    @JsonProperty("body")
    private String body;

    /**
     * Set to sms for SMS messages and mms for MMS messages.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends MessageType> type;

    /**
     * The scheduled date and time of the message.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scheduled_at")
    private Optional<OffsetDateTime> scheduledAt;

    /**
     * Define a webhook to receive delivery notifications.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("webhook_url")
    private Optional<String> webhookUrl;

    /**
     * A client reference.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    private Optional<String> reference;

    /**
     * The ID of the Messaging Service used with the message. In case of Plivo this links to the Powerpack ID.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("messaging_service_id")
    private Optional<String> messagingServiceId;

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pass_through")
    private Optional<? extends List<PassThroughBody>> passThrough;

    @JsonCreator
    public MessageInput(
            @JsonProperty("from") String from,
            @JsonProperty("to") String to,
            @JsonProperty("subject") Optional<String> subject,
            @JsonProperty("body") String body,
            @JsonProperty("type") Optional<? extends MessageType> type,
            @JsonProperty("scheduled_at") Optional<OffsetDateTime> scheduledAt,
            @JsonProperty("webhook_url") Optional<String> webhookUrl,
            @JsonProperty("reference") Optional<String> reference,
            @JsonProperty("messaging_service_id") Optional<String> messagingServiceId,
            @JsonProperty("pass_through") Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(from, "from");
        Utils.checkNotNull(to, "to");
        Utils.checkNotNull(subject, "subject");
        Utils.checkNotNull(body, "body");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        Utils.checkNotNull(webhookUrl, "webhookUrl");
        Utils.checkNotNull(reference, "reference");
        Utils.checkNotNull(messagingServiceId, "messagingServiceId");
        Utils.checkNotNull(passThrough, "passThrough");
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.type = type;
        this.scheduledAt = scheduledAt;
        this.webhookUrl = webhookUrl;
        this.reference = reference;
        this.messagingServiceId = messagingServiceId;
        this.passThrough = passThrough;
    }
    
    public MessageInput(
            String from,
            String to,
            String body) {
        this(from, to, Optional.empty(),
            body, Optional.empty(), Optional.empty(),
            Optional.empty(), Optional.empty(), Optional.empty(),
            Optional.empty());
    }

    /**
     * The phone number that initiated the message.
     */
    @JsonIgnore
    public String from() {
        return from;
    }

    /**
     * The phone number that received the message.
     */
    @JsonIgnore
    public String to() {
        return to;
    }

    @JsonIgnore
    public Optional<String> subject() {
        return subject;
    }

    /**
     * The message text.
     */
    @JsonIgnore
    public String body() {
        return body;
    }

    /**
     * Set to sms for SMS messages and mms for MMS messages.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<MessageType> type() {
        return (Optional<MessageType>) type;
    }

    /**
     * The scheduled date and time of the message.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> scheduledAt() {
        return scheduledAt;
    }

    /**
     * Define a webhook to receive delivery notifications.
     */
    @JsonIgnore
    public Optional<String> webhookUrl() {
        return webhookUrl;
    }

    /**
     * A client reference.
     */
    @JsonIgnore
    public Optional<String> reference() {
        return reference;
    }

    /**
     * The ID of the Messaging Service used with the message. In case of Plivo this links to the Powerpack ID.
     */
    @JsonIgnore
    public Optional<String> messagingServiceId() {
        return messagingServiceId;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<PassThroughBody>> passThrough() {
        return (Optional<List<PassThroughBody>>) passThrough;
    }

    public static Builder builder() {
        return new Builder();
    }


    /**
     * The phone number that initiated the message.
     */
    public MessageInput withFrom(String from) {
        Utils.checkNotNull(from, "from");
        this.from = from;
        return this;
    }

    /**
     * The phone number that received the message.
     */
    public MessageInput withTo(String to) {
        Utils.checkNotNull(to, "to");
        this.to = to;
        return this;
    }

    public MessageInput withSubject(String subject) {
        Utils.checkNotNull(subject, "subject");
        this.subject = Optional.ofNullable(subject);
        return this;
    }


    public MessageInput withSubject(Optional<String> subject) {
        Utils.checkNotNull(subject, "subject");
        this.subject = subject;
        return this;
    }

    /**
     * The message text.
     */
    public MessageInput withBody(String body) {
        Utils.checkNotNull(body, "body");
        this.body = body;
        return this;
    }

    /**
     * Set to sms for SMS messages and mms for MMS messages.
     */
    public MessageInput withType(MessageType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }


    /**
     * Set to sms for SMS messages and mms for MMS messages.
     */
    public MessageInput withType(Optional<? extends MessageType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The scheduled date and time of the message.
     */
    public MessageInput withScheduledAt(OffsetDateTime scheduledAt) {
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        this.scheduledAt = Optional.ofNullable(scheduledAt);
        return this;
    }


    /**
     * The scheduled date and time of the message.
     */
    public MessageInput withScheduledAt(Optional<OffsetDateTime> scheduledAt) {
        Utils.checkNotNull(scheduledAt, "scheduledAt");
        this.scheduledAt = scheduledAt;
        return this;
    }

    /**
     * Define a webhook to receive delivery notifications.
     */
    public MessageInput withWebhookUrl(String webhookUrl) {
        Utils.checkNotNull(webhookUrl, "webhookUrl");
        this.webhookUrl = Optional.ofNullable(webhookUrl);
        return this;
    }


    /**
     * Define a webhook to receive delivery notifications.
     */
    public MessageInput withWebhookUrl(Optional<String> webhookUrl) {
        Utils.checkNotNull(webhookUrl, "webhookUrl");
        this.webhookUrl = webhookUrl;
        return this;
    }

    /**
     * A client reference.
     */
    public MessageInput withReference(String reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = Optional.ofNullable(reference);
        return this;
    }


    /**
     * A client reference.
     */
    public MessageInput withReference(Optional<String> reference) {
        Utils.checkNotNull(reference, "reference");
        this.reference = reference;
        return this;
    }

    /**
     * The ID of the Messaging Service used with the message. In case of Plivo this links to the Powerpack ID.
     */
    public MessageInput withMessagingServiceId(String messagingServiceId) {
        Utils.checkNotNull(messagingServiceId, "messagingServiceId");
        this.messagingServiceId = Optional.ofNullable(messagingServiceId);
        return this;
    }


    /**
     * The ID of the Messaging Service used with the message. In case of Plivo this links to the Powerpack ID.
     */
    public MessageInput withMessagingServiceId(Optional<String> messagingServiceId) {
        Utils.checkNotNull(messagingServiceId, "messagingServiceId");
        this.messagingServiceId = messagingServiceId;
        return this;
    }

    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public MessageInput withPassThrough(List<PassThroughBody> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = Optional.ofNullable(passThrough);
        return this;
    }


    /**
     * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
     */
    public MessageInput withPassThrough(Optional<? extends List<PassThroughBody>> passThrough) {
        Utils.checkNotNull(passThrough, "passThrough");
        this.passThrough = passThrough;
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
        MessageInput other = (MessageInput) o;
        return 
            Utils.enhancedDeepEquals(this.from, other.from) &&
            Utils.enhancedDeepEquals(this.to, other.to) &&
            Utils.enhancedDeepEquals(this.subject, other.subject) &&
            Utils.enhancedDeepEquals(this.body, other.body) &&
            Utils.enhancedDeepEquals(this.type, other.type) &&
            Utils.enhancedDeepEquals(this.scheduledAt, other.scheduledAt) &&
            Utils.enhancedDeepEquals(this.webhookUrl, other.webhookUrl) &&
            Utils.enhancedDeepEquals(this.reference, other.reference) &&
            Utils.enhancedDeepEquals(this.messagingServiceId, other.messagingServiceId) &&
            Utils.enhancedDeepEquals(this.passThrough, other.passThrough);
    }
    
    @Override
    public int hashCode() {
        return Utils.enhancedHash(
            from, to, subject,
            body, type, scheduledAt,
            webhookUrl, reference, messagingServiceId,
            passThrough);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MessageInput.class,
                "from", from,
                "to", to,
                "subject", subject,
                "body", body,
                "type", type,
                "scheduledAt", scheduledAt,
                "webhookUrl", webhookUrl,
                "reference", reference,
                "messagingServiceId", messagingServiceId,
                "passThrough", passThrough);
    }

    @SuppressWarnings("UnusedReturnValue")
    public final static class Builder {

        private String from;

        private String to;

        private Optional<String> subject = Optional.empty();

        private String body;

        private Optional<? extends MessageType> type = Optional.empty();

        private Optional<OffsetDateTime> scheduledAt = Optional.empty();

        private Optional<String> webhookUrl = Optional.empty();

        private Optional<String> reference = Optional.empty();

        private Optional<String> messagingServiceId = Optional.empty();

        private Optional<? extends List<PassThroughBody>> passThrough = Optional.empty();

        private Builder() {
          // force use of static builder() method
        }


        /**
         * The phone number that initiated the message.
         */
        public Builder from(String from) {
            Utils.checkNotNull(from, "from");
            this.from = from;
            return this;
        }


        /**
         * The phone number that received the message.
         */
        public Builder to(String to) {
            Utils.checkNotNull(to, "to");
            this.to = to;
            return this;
        }


        public Builder subject(String subject) {
            Utils.checkNotNull(subject, "subject");
            this.subject = Optional.ofNullable(subject);
            return this;
        }

        public Builder subject(Optional<String> subject) {
            Utils.checkNotNull(subject, "subject");
            this.subject = subject;
            return this;
        }


        /**
         * The message text.
         */
        public Builder body(String body) {
            Utils.checkNotNull(body, "body");
            this.body = body;
            return this;
        }


        /**
         * Set to sms for SMS messages and mms for MMS messages.
         */
        public Builder type(MessageType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * Set to sms for SMS messages and mms for MMS messages.
         */
        public Builder type(Optional<? extends MessageType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }


        /**
         * The scheduled date and time of the message.
         */
        public Builder scheduledAt(OffsetDateTime scheduledAt) {
            Utils.checkNotNull(scheduledAt, "scheduledAt");
            this.scheduledAt = Optional.ofNullable(scheduledAt);
            return this;
        }

        /**
         * The scheduled date and time of the message.
         */
        public Builder scheduledAt(Optional<OffsetDateTime> scheduledAt) {
            Utils.checkNotNull(scheduledAt, "scheduledAt");
            this.scheduledAt = scheduledAt;
            return this;
        }


        /**
         * Define a webhook to receive delivery notifications.
         */
        public Builder webhookUrl(String webhookUrl) {
            Utils.checkNotNull(webhookUrl, "webhookUrl");
            this.webhookUrl = Optional.ofNullable(webhookUrl);
            return this;
        }

        /**
         * Define a webhook to receive delivery notifications.
         */
        public Builder webhookUrl(Optional<String> webhookUrl) {
            Utils.checkNotNull(webhookUrl, "webhookUrl");
            this.webhookUrl = webhookUrl;
            return this;
        }


        /**
         * A client reference.
         */
        public Builder reference(String reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = Optional.ofNullable(reference);
            return this;
        }

        /**
         * A client reference.
         */
        public Builder reference(Optional<String> reference) {
            Utils.checkNotNull(reference, "reference");
            this.reference = reference;
            return this;
        }


        /**
         * The ID of the Messaging Service used with the message. In case of Plivo this links to the Powerpack ID.
         */
        public Builder messagingServiceId(String messagingServiceId) {
            Utils.checkNotNull(messagingServiceId, "messagingServiceId");
            this.messagingServiceId = Optional.ofNullable(messagingServiceId);
            return this;
        }

        /**
         * The ID of the Messaging Service used with the message. In case of Plivo this links to the Powerpack ID.
         */
        public Builder messagingServiceId(Optional<String> messagingServiceId) {
            Utils.checkNotNull(messagingServiceId, "messagingServiceId");
            this.messagingServiceId = messagingServiceId;
            return this;
        }


        /**
         * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
         */
        public Builder passThrough(List<PassThroughBody> passThrough) {
            Utils.checkNotNull(passThrough, "passThrough");
            this.passThrough = Optional.ofNullable(passThrough);
            return this;
        }

        /**
         * The pass_through property allows passing service-specific, custom data or structured modifications in request body when creating or updating resources.
         */
        public Builder passThrough(Optional<? extends List<PassThroughBody>> passThrough) {
            Utils.checkNotNull(passThrough, "passThrough");
            this.passThrough = passThrough;
            return this;
        }

        public MessageInput build() {

            return new MessageInput(
                from, to, subject,
                body, type, scheduledAt,
                webhookUrl, reference, messagingServiceId,
                passThrough);
        }

    }
}
