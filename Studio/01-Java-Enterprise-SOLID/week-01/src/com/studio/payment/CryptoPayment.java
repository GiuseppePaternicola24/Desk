package com.studio.payment;

public class CryptoPayment {
    private final double amount;
    private final String walletAddress;
    private final String blockchain;

    public CryptoPayment(double amount, String walletAddress, String blockchain) {
        this.amount = amount;
        this.walletAddress = walletAddress;
        this.blockchain = blockchain;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getDetails() {
        return "wallet " + this.blockchain + ": " + this.walletAddress;
    }

}
