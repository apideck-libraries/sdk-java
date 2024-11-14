/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.apideck.unify;

import com.apideck.unify.models.operations.SDKMethodInterfaces.*; 

public class Accounting {

    private final SDKConfiguration sdkConfiguration;
    private final TaxRates taxRates;
    private final Bills bills;
    private final Invoices invoices;
    private final LedgerAccounts ledgerAccounts;
    private final InvoiceItems invoiceItems;
    private final CreditNotes creditNotes;
    private final Customers customers;
    private final Suppliers suppliers;
    private final Payments payments;
    private final CompanyInfo companyInfo;
    private final BalanceSheet balanceSheet;
    private final ProfitAndLoss profitAndLoss;
    private final JournalEntries journalEntries;
    private final PurchaseOrders purchaseOrders;
    private final Subsidiaries subsidiaries;
    private final Locations locations;
    private final Departments departments;
    private final Attachments attachments;
    private final TrackingCategories trackingCategories;
    private final BillPayments billPayments;
    private final Expenses expenses;

    Accounting(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.taxRates = new TaxRates(this.sdkConfiguration);
        this.bills = new Bills(this.sdkConfiguration);
        this.invoices = new Invoices(this.sdkConfiguration);
        this.ledgerAccounts = new LedgerAccounts(this.sdkConfiguration);
        this.invoiceItems = new InvoiceItems(this.sdkConfiguration);
        this.creditNotes = new CreditNotes(this.sdkConfiguration);
        this.customers = new Customers(this.sdkConfiguration);
        this.suppliers = new Suppliers(this.sdkConfiguration);
        this.payments = new Payments(this.sdkConfiguration);
        this.companyInfo = new CompanyInfo(this.sdkConfiguration);
        this.balanceSheet = new BalanceSheet(this.sdkConfiguration);
        this.profitAndLoss = new ProfitAndLoss(this.sdkConfiguration);
        this.journalEntries = new JournalEntries(this.sdkConfiguration);
        this.purchaseOrders = new PurchaseOrders(this.sdkConfiguration);
        this.subsidiaries = new Subsidiaries(this.sdkConfiguration);
        this.locations = new Locations(this.sdkConfiguration);
        this.departments = new Departments(this.sdkConfiguration);
        this.attachments = new Attachments(this.sdkConfiguration);
        this.trackingCategories = new TrackingCategories(this.sdkConfiguration);
        this.billPayments = new BillPayments(this.sdkConfiguration);
        this.expenses = new Expenses(this.sdkConfiguration);
    }

    public final TaxRates taxRates() {
        return taxRates;
    }

    public final Bills bills() {
        return bills;
    }

    public final Invoices invoices() {
        return invoices;
    }

    public final LedgerAccounts ledgerAccounts() {
        return ledgerAccounts;
    }

    public final InvoiceItems invoiceItems() {
        return invoiceItems;
    }

    public final CreditNotes creditNotes() {
        return creditNotes;
    }

    public final Customers customers() {
        return customers;
    }

    public final Suppliers suppliers() {
        return suppliers;
    }

    public final Payments payments() {
        return payments;
    }

    public final CompanyInfo companyInfo() {
        return companyInfo;
    }

    public final BalanceSheet balanceSheet() {
        return balanceSheet;
    }

    public final ProfitAndLoss profitAndLoss() {
        return profitAndLoss;
    }

    public final JournalEntries journalEntries() {
        return journalEntries;
    }

    public final PurchaseOrders purchaseOrders() {
        return purchaseOrders;
    }

    public final Subsidiaries subsidiaries() {
        return subsidiaries;
    }

    public final Locations locations() {
        return locations;
    }

    public final Departments departments() {
        return departments;
    }

    public final Attachments attachments() {
        return attachments;
    }

    public final TrackingCategories trackingCategories() {
        return trackingCategories;
    }

    public final BillPayments billPayments() {
        return billPayments;
    }

    public final Expenses expenses() {
        return expenses;
    }
}
