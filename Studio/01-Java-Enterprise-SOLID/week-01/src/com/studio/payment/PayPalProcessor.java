package com.studio.payment;

/**
 * Implementazione concreta del processore per pagamenti tramite PayPal.
 * Gestisce esclusivamente oggetti di tipo PayPalPayment.
 */
public class PayPalProcessor implements PaymentProcessor<PayPalPayment> {

    @Override
    public void process(PayPalPayment payment) {
        // Esegue la stampa dei dettagli dell'account PayPal associato
        System.out.println(payment.getDetails());
        System.out.println("Saldo: " + payment.getAmount());
    }

}
