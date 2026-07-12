package com.studio.payment;

/**
 * Modello concreto che rappresenta un pagamento tramite Criptovaluta.
 * Implementa l'interfaccia Payment.
 */
public class CryptoPayment implements Payment {
    private final double amount;
    private final String walletAddress;
    private final String blockchain;

    /**
     * Costruttore per inizializzare i dettagli del pagamento crypto.
     */
    public CryptoPayment(double amount, String walletAddress, String blockchain) {
        this.amount = amount;
        this.walletAddress = walletAddress;
        this.blockchain = blockchain;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }

    @Override
    public String getDetails() {
        // Mostra l'indirizzo del wallet e la blockchain di riferimento (es. Bitcoin, Ethereum)
        return "Wallet " + this.blockchain + ": " + this.walletAddress;
    }
}
