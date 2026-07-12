package com.studio.payment;

public class CreditCardPayment {
    private final double amount;
    private final String cardHolder;
    private final String cardNumber;

    public CreditCardPayment(double amount, String cardHolder, String cardNumber) {
        this.amount = amount;
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getDetails() {
        return "Holder: " + this.cardHolder + " \n" + "Card Number: " + this.cardNumber;
    }

}
