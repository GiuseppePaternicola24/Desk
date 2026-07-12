package com.studio.payment;

/**
 * Modello concreto che rappresenta un pagamento effettuato tramite Carta di Credito.
 * Implementa l'interfaccia Payment.
 */
public class CreditCardPayment implements Payment {
    private final double amount;
    private final String cardHolder;
    private final String cardNumber;

    /**
     * Costruttore per inizializzare i dettagli della carta di credito.
     */
    public CreditCardPayment(double amount, String cardHolder, String cardNumber) {
        this.amount = amount;
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }

    @Override
    public String getDetails() {
        // Restituisce i dettagli formattati relativi a intestatario e numero di carta
        return "Holder: " + this.cardHolder + " \n" + "Card Number: " + this.cardNumber;
    }
}
