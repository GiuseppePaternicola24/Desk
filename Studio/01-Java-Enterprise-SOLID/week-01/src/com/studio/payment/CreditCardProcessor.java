package com.studio.payment;

/**
 * Implementazione concreta del processore per pagamenti con Carta di Credito.
 * Gestisce esclusivamente oggetti di tipo CreditCardPayment.
 */
public class CreditCardProcessor implements PaymentProcessor<CreditCardPayment> {

    @Override
    public void process(CreditCardPayment payment) {
        // Esegue il comportamento specifico (qui simulato con una stampa in console)
        System.out.println(payment.getDetails());
        System.out.println("Saldo: " + payment.getAmount());
    }
}
