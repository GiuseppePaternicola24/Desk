package com.studio.payment;

/**
 * Modello concreto che rappresenta un pagamento tramite PayPal.
 * Implementa l'interfaccia Payment.
 */
public class PayPalPayment implements Payment {
    private final double amount;
    private final String email;

    /**
     * Costruttore per inizializzare il pagamento con l'email dell'account PayPal.
     */
    public PayPalPayment(double amount, String email) {
        this.amount = amount;
        this.email = email;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }

    @Override
    public String getDetails() {
        // Mostra l'email associata al conto PayPal
        return "Account Paypal: " + this.email;
    }

}
