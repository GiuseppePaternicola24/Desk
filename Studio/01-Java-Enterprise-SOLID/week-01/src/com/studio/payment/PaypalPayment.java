package com.studio.payment;

public class PaypalPayment {
    private final double amount;
    private final String email;

    public PaypalPayment(double amount, String email) {
        this.amount = amount;
        this.email = email;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getDetails() {
        return "Account Paypal: " + this.email;
    }

}
