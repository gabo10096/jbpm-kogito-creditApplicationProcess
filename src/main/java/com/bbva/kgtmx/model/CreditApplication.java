package com.bbva.kgtmx.model;

public class CreditApplication {

    private String accountReference;
    private String clientName;
    private Double amount;
    private Boolean approved;

    public String getAccountReference() {
        return accountReference;
    }

    public void setAccountReference(String accountReference) {
        this.accountReference = accountReference;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean isApproved() {
        return approved;
    }

    public void isApproved(Boolean approved) {
        this.approved = approved;
    }

    @Override
    public String toString() {
        return "CreditApplicationData [accountReference=" + accountReference + ", amount=" + amount + ", approved="
                + approved + ", clientName=" + clientName + "]";
    }

}