package com.studio.payment;

/**
 * Implementazione concreta del processore per pagamenti in Criptovalute.
 * Gestisce esclusivamente oggetti di tipo CryptoPayment.
 */
public class CryptoProcessor implements PaymentProcessor<CryptoPayment> {

    @Override
    public void process(CryptoPayment payment) {
        // Esegue la stampa dei dettagli della transazione sulla blockchain
        System.out.println(payment.getDetails());
        System.out.println("Saldo: " + payment.getAmount());
    }
}
