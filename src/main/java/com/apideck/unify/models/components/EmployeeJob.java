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
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class EmployeeJob {

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    /**
     * A unique identifier for an object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_id")
    private JsonNullable<String> employeeId;

    /**
     * The job title of the person.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private JsonNullable<String> title;

    /**
     * The position and responsibilities of the person within the organization.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("role")
    private JsonNullable<String> role;

    /**
     * The date on which the employee starts working in their current job role.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private JsonNullable<LocalDate> startDate;

    /**
     * The date on which the employee leaves or is expected to leave their current job role.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private JsonNullable<LocalDate> endDate;

    /**
     * The rate of pay for the employee in their current job role.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compensation_rate")
    private JsonNullable<Double> compensationRate;

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private JsonNullable<? extends Currency> currency;

    /**
     * Unit of measurement for employee compensation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_unit")
    private JsonNullable<? extends PaymentUnit> paymentUnit;

    /**
     * The date on which the employee was hired by the organization
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hired_at")
    private JsonNullable<LocalDate> hiredAt;

    /**
     * Indicates whether this the employee's primary job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_primary")
    private JsonNullable<Boolean> isPrimary;

    /**
     * Indicates whether this the employee has a manager role.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_manager")
    private JsonNullable<Boolean> isManager;

    /**
     * Indicates the status of the job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private JsonNullable<? extends EmployeeJobStatus> status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")
    private Optional<? extends Address> location;

    @JsonCreator
    public EmployeeJob(
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("employee_id") JsonNullable<String> employeeId,
            @JsonProperty("title") JsonNullable<String> title,
            @JsonProperty("role") JsonNullable<String> role,
            @JsonProperty("start_date") JsonNullable<LocalDate> startDate,
            @JsonProperty("end_date") JsonNullable<LocalDate> endDate,
            @JsonProperty("compensation_rate") JsonNullable<Double> compensationRate,
            @JsonProperty("currency") JsonNullable<? extends Currency> currency,
            @JsonProperty("payment_unit") JsonNullable<? extends PaymentUnit> paymentUnit,
            @JsonProperty("hired_at") JsonNullable<LocalDate> hiredAt,
            @JsonProperty("is_primary") JsonNullable<Boolean> isPrimary,
            @JsonProperty("is_manager") JsonNullable<Boolean> isManager,
            @JsonProperty("status") JsonNullable<? extends EmployeeJobStatus> status,
            @JsonProperty("location") Optional<? extends Address> location) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(employeeId, "employeeId");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(role, "role");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(compensationRate, "compensationRate");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(paymentUnit, "paymentUnit");
        Utils.checkNotNull(hiredAt, "hiredAt");
        Utils.checkNotNull(isPrimary, "isPrimary");
        Utils.checkNotNull(isManager, "isManager");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(location, "location");
        this.id = id;
        this.employeeId = employeeId;
        this.title = title;
        this.role = role;
        this.startDate = startDate;
        this.endDate = endDate;
        this.compensationRate = compensationRate;
        this.currency = currency;
        this.paymentUnit = paymentUnit;
        this.hiredAt = hiredAt;
        this.isPrimary = isPrimary;
        this.isManager = isManager;
        this.status = status;
        this.location = location;
    }
    
    public EmployeeJob() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    /**
     * A unique identifier for an object.
     */
    @JsonIgnore
    public JsonNullable<String> employeeId() {
        return employeeId;
    }

    /**
     * The job title of the person.
     */
    @JsonIgnore
    public JsonNullable<String> title() {
        return title;
    }

    /**
     * The position and responsibilities of the person within the organization.
     */
    @JsonIgnore
    public JsonNullable<String> role() {
        return role;
    }

    /**
     * The date on which the employee starts working in their current job role.
     */
    @JsonIgnore
    public JsonNullable<LocalDate> startDate() {
        return startDate;
    }

    /**
     * The date on which the employee leaves or is expected to leave their current job role.
     */
    @JsonIgnore
    public JsonNullable<LocalDate> endDate() {
        return endDate;
    }

    /**
     * The rate of pay for the employee in their current job role.
     */
    @JsonIgnore
    public JsonNullable<Double> compensationRate() {
        return compensationRate;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<Currency> currency() {
        return (JsonNullable<Currency>) currency;
    }

    /**
     * Unit of measurement for employee compensation.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<PaymentUnit> paymentUnit() {
        return (JsonNullable<PaymentUnit>) paymentUnit;
    }

    /**
     * The date on which the employee was hired by the organization
     */
    @JsonIgnore
    public JsonNullable<LocalDate> hiredAt() {
        return hiredAt;
    }

    /**
     * Indicates whether this the employee's primary job.
     */
    @JsonIgnore
    public JsonNullable<Boolean> isPrimary() {
        return isPrimary;
    }

    /**
     * Indicates whether this the employee has a manager role.
     */
    @JsonIgnore
    public JsonNullable<Boolean> isManager() {
        return isManager;
    }

    /**
     * Indicates the status of the job.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<EmployeeJobStatus> status() {
        return (JsonNullable<EmployeeJobStatus>) status;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Address> location() {
        return (Optional<Address>) location;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier for an object.
     */
    public EmployeeJob withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public EmployeeJob withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public EmployeeJob withEmployeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = JsonNullable.of(employeeId);
        return this;
    }

    /**
     * A unique identifier for an object.
     */
    public EmployeeJob withEmployeeId(JsonNullable<String> employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }

    /**
     * The job title of the person.
     */
    public EmployeeJob withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * The job title of the person.
     */
    public EmployeeJob withTitle(JsonNullable<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * The position and responsibilities of the person within the organization.
     */
    public EmployeeJob withRole(String role) {
        Utils.checkNotNull(role, "role");
        this.role = JsonNullable.of(role);
        return this;
    }

    /**
     * The position and responsibilities of the person within the organization.
     */
    public EmployeeJob withRole(JsonNullable<String> role) {
        Utils.checkNotNull(role, "role");
        this.role = role;
        return this;
    }

    /**
     * The date on which the employee starts working in their current job role.
     */
    public EmployeeJob withStartDate(LocalDate startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = JsonNullable.of(startDate);
        return this;
    }

    /**
     * The date on which the employee starts working in their current job role.
     */
    public EmployeeJob withStartDate(JsonNullable<LocalDate> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * The date on which the employee leaves or is expected to leave their current job role.
     */
    public EmployeeJob withEndDate(LocalDate endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = JsonNullable.of(endDate);
        return this;
    }

    /**
     * The date on which the employee leaves or is expected to leave their current job role.
     */
    public EmployeeJob withEndDate(JsonNullable<LocalDate> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * The rate of pay for the employee in their current job role.
     */
    public EmployeeJob withCompensationRate(double compensationRate) {
        Utils.checkNotNull(compensationRate, "compensationRate");
        this.compensationRate = JsonNullable.of(compensationRate);
        return this;
    }

    /**
     * The rate of pay for the employee in their current job role.
     */
    public EmployeeJob withCompensationRate(JsonNullable<Double> compensationRate) {
        Utils.checkNotNull(compensationRate, "compensationRate");
        this.compensationRate = compensationRate;
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public EmployeeJob withCurrency(Currency currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = JsonNullable.of(currency);
        return this;
    }

    /**
     * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     */
    public EmployeeJob withCurrency(JsonNullable<? extends Currency> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Unit of measurement for employee compensation.
     */
    public EmployeeJob withPaymentUnit(PaymentUnit paymentUnit) {
        Utils.checkNotNull(paymentUnit, "paymentUnit");
        this.paymentUnit = JsonNullable.of(paymentUnit);
        return this;
    }

    /**
     * Unit of measurement for employee compensation.
     */
    public EmployeeJob withPaymentUnit(JsonNullable<? extends PaymentUnit> paymentUnit) {
        Utils.checkNotNull(paymentUnit, "paymentUnit");
        this.paymentUnit = paymentUnit;
        return this;
    }

    /**
     * The date on which the employee was hired by the organization
     */
    public EmployeeJob withHiredAt(LocalDate hiredAt) {
        Utils.checkNotNull(hiredAt, "hiredAt");
        this.hiredAt = JsonNullable.of(hiredAt);
        return this;
    }

    /**
     * The date on which the employee was hired by the organization
     */
    public EmployeeJob withHiredAt(JsonNullable<LocalDate> hiredAt) {
        Utils.checkNotNull(hiredAt, "hiredAt");
        this.hiredAt = hiredAt;
        return this;
    }

    /**
     * Indicates whether this the employee's primary job.
     */
    public EmployeeJob withIsPrimary(boolean isPrimary) {
        Utils.checkNotNull(isPrimary, "isPrimary");
        this.isPrimary = JsonNullable.of(isPrimary);
        return this;
    }

    /**
     * Indicates whether this the employee's primary job.
     */
    public EmployeeJob withIsPrimary(JsonNullable<Boolean> isPrimary) {
        Utils.checkNotNull(isPrimary, "isPrimary");
        this.isPrimary = isPrimary;
        return this;
    }

    /**
     * Indicates whether this the employee has a manager role.
     */
    public EmployeeJob withIsManager(boolean isManager) {
        Utils.checkNotNull(isManager, "isManager");
        this.isManager = JsonNullable.of(isManager);
        return this;
    }

    /**
     * Indicates whether this the employee has a manager role.
     */
    public EmployeeJob withIsManager(JsonNullable<Boolean> isManager) {
        Utils.checkNotNull(isManager, "isManager");
        this.isManager = isManager;
        return this;
    }

    /**
     * Indicates the status of the job.
     */
    public EmployeeJob withStatus(EmployeeJobStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * Indicates the status of the job.
     */
    public EmployeeJob withStatus(JsonNullable<? extends EmployeeJobStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public EmployeeJob withLocation(Address location) {
        Utils.checkNotNull(location, "location");
        this.location = Optional.ofNullable(location);
        return this;
    }

    public EmployeeJob withLocation(Optional<? extends Address> location) {
        Utils.checkNotNull(location, "location");
        this.location = location;
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
        EmployeeJob other = (EmployeeJob) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.employeeId, other.employeeId) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.role, other.role) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.endDate, other.endDate) &&
            Objects.deepEquals(this.compensationRate, other.compensationRate) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.paymentUnit, other.paymentUnit) &&
            Objects.deepEquals(this.hiredAt, other.hiredAt) &&
            Objects.deepEquals(this.isPrimary, other.isPrimary) &&
            Objects.deepEquals(this.isManager, other.isManager) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.location, other.location);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            employeeId,
            title,
            role,
            startDate,
            endDate,
            compensationRate,
            currency,
            paymentUnit,
            hiredAt,
            isPrimary,
            isManager,
            status,
            location);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmployeeJob.class,
                "id", id,
                "employeeId", employeeId,
                "title", title,
                "role", role,
                "startDate", startDate,
                "endDate", endDate,
                "compensationRate", compensationRate,
                "currency", currency,
                "paymentUnit", paymentUnit,
                "hiredAt", hiredAt,
                "isPrimary", isPrimary,
                "isManager", isManager,
                "status", status,
                "location", location);
    }
    
    public final static class Builder {
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private JsonNullable<String> employeeId = JsonNullable.undefined();
 
        private JsonNullable<String> title = JsonNullable.undefined();
 
        private JsonNullable<String> role = JsonNullable.undefined();
 
        private JsonNullable<LocalDate> startDate = JsonNullable.undefined();
 
        private JsonNullable<LocalDate> endDate = JsonNullable.undefined();
 
        private JsonNullable<Double> compensationRate = JsonNullable.undefined();
 
        private JsonNullable<? extends Currency> currency = JsonNullable.undefined();
 
        private JsonNullable<? extends PaymentUnit> paymentUnit = JsonNullable.undefined();
 
        private JsonNullable<LocalDate> hiredAt = JsonNullable.undefined();
 
        private JsonNullable<Boolean> isPrimary = JsonNullable.undefined();
 
        private JsonNullable<Boolean> isManager = JsonNullable.undefined();
 
        private JsonNullable<? extends EmployeeJobStatus> status = JsonNullable.undefined();
 
        private Optional<? extends Address> location = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder employeeId(String employeeId) {
            Utils.checkNotNull(employeeId, "employeeId");
            this.employeeId = JsonNullable.of(employeeId);
            return this;
        }

        /**
         * A unique identifier for an object.
         */
        public Builder employeeId(JsonNullable<String> employeeId) {
            Utils.checkNotNull(employeeId, "employeeId");
            this.employeeId = employeeId;
            return this;
        }

        /**
         * The job title of the person.
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = JsonNullable.of(title);
            return this;
        }

        /**
         * The job title of the person.
         */
        public Builder title(JsonNullable<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * The position and responsibilities of the person within the organization.
         */
        public Builder role(String role) {
            Utils.checkNotNull(role, "role");
            this.role = JsonNullable.of(role);
            return this;
        }

        /**
         * The position and responsibilities of the person within the organization.
         */
        public Builder role(JsonNullable<String> role) {
            Utils.checkNotNull(role, "role");
            this.role = role;
            return this;
        }

        /**
         * The date on which the employee starts working in their current job role.
         */
        public Builder startDate(LocalDate startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = JsonNullable.of(startDate);
            return this;
        }

        /**
         * The date on which the employee starts working in their current job role.
         */
        public Builder startDate(JsonNullable<LocalDate> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * The date on which the employee leaves or is expected to leave their current job role.
         */
        public Builder endDate(LocalDate endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = JsonNullable.of(endDate);
            return this;
        }

        /**
         * The date on which the employee leaves or is expected to leave their current job role.
         */
        public Builder endDate(JsonNullable<LocalDate> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * The rate of pay for the employee in their current job role.
         */
        public Builder compensationRate(double compensationRate) {
            Utils.checkNotNull(compensationRate, "compensationRate");
            this.compensationRate = JsonNullable.of(compensationRate);
            return this;
        }

        /**
         * The rate of pay for the employee in their current job role.
         */
        public Builder compensationRate(JsonNullable<Double> compensationRate) {
            Utils.checkNotNull(compensationRate, "compensationRate");
            this.compensationRate = compensationRate;
            return this;
        }

        /**
         * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
         */
        public Builder currency(Currency currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = JsonNullable.of(currency);
            return this;
        }

        /**
         * Indicates the associated currency for an amount of money. Values correspond to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
         */
        public Builder currency(JsonNullable<? extends Currency> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        /**
         * Unit of measurement for employee compensation.
         */
        public Builder paymentUnit(PaymentUnit paymentUnit) {
            Utils.checkNotNull(paymentUnit, "paymentUnit");
            this.paymentUnit = JsonNullable.of(paymentUnit);
            return this;
        }

        /**
         * Unit of measurement for employee compensation.
         */
        public Builder paymentUnit(JsonNullable<? extends PaymentUnit> paymentUnit) {
            Utils.checkNotNull(paymentUnit, "paymentUnit");
            this.paymentUnit = paymentUnit;
            return this;
        }

        /**
         * The date on which the employee was hired by the organization
         */
        public Builder hiredAt(LocalDate hiredAt) {
            Utils.checkNotNull(hiredAt, "hiredAt");
            this.hiredAt = JsonNullable.of(hiredAt);
            return this;
        }

        /**
         * The date on which the employee was hired by the organization
         */
        public Builder hiredAt(JsonNullable<LocalDate> hiredAt) {
            Utils.checkNotNull(hiredAt, "hiredAt");
            this.hiredAt = hiredAt;
            return this;
        }

        /**
         * Indicates whether this the employee's primary job.
         */
        public Builder isPrimary(boolean isPrimary) {
            Utils.checkNotNull(isPrimary, "isPrimary");
            this.isPrimary = JsonNullable.of(isPrimary);
            return this;
        }

        /**
         * Indicates whether this the employee's primary job.
         */
        public Builder isPrimary(JsonNullable<Boolean> isPrimary) {
            Utils.checkNotNull(isPrimary, "isPrimary");
            this.isPrimary = isPrimary;
            return this;
        }

        /**
         * Indicates whether this the employee has a manager role.
         */
        public Builder isManager(boolean isManager) {
            Utils.checkNotNull(isManager, "isManager");
            this.isManager = JsonNullable.of(isManager);
            return this;
        }

        /**
         * Indicates whether this the employee has a manager role.
         */
        public Builder isManager(JsonNullable<Boolean> isManager) {
            Utils.checkNotNull(isManager, "isManager");
            this.isManager = isManager;
            return this;
        }

        /**
         * Indicates the status of the job.
         */
        public Builder status(EmployeeJobStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = JsonNullable.of(status);
            return this;
        }

        /**
         * Indicates the status of the job.
         */
        public Builder status(JsonNullable<? extends EmployeeJobStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder location(Address location) {
            Utils.checkNotNull(location, "location");
            this.location = Optional.ofNullable(location);
            return this;
        }

        public Builder location(Optional<? extends Address> location) {
            Utils.checkNotNull(location, "location");
            this.location = location;
            return this;
        }
        
        public EmployeeJob build() {
            return new EmployeeJob(
                id,
                employeeId,
                title,
                role,
                startDate,
                endDate,
                compensationRate,
                currency,
                paymentUnit,
                hiredAt,
                isPrimary,
                isManager,
                status,
                location);
        }
    }
}

