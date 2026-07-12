package com.studio.payment;

/**
 * Classe principale per eseguire l'applicazione e testare le diverse strategie di pagamento.
 */
public class Main {
    public static void main(String[] args) {
        
        // ==========================================
        // 1. Esempio Carta di Credito
        // ==========================================
        CreditCardPayment creditCardPayment = new CreditCardPayment(10, "Pippo Pappa", "2889712xp2897");
        PaymentProcessor<CreditCardPayment> creditCardProcess = new CreditCardProcessor();
        PaymentService<CreditCardPayment> CCService = new PaymentService<>(creditCardProcess);

        CCService.executeTransaction(creditCardPayment);

        // ==========================================
        // 2. Esempio Criptovalute
        // ==========================================
        CryptoPayment cryptoPayment = new CryptoPayment(10, "09x19041", "BitCoin");
        PaymentProcessor<CryptoPayment> cryptoProcess = new CryptoProcessor();
        PaymentService<CryptoPayment> CService = new PaymentService<>(cryptoProcess);

        CService.executeTransaction(cryptoPayment);

        // ==========================================
        // 3. Esempio PayPal
        // ==========================================
        // Utilizziamo PayPalPayment (corretto nel nome)
        PayPalPayment PPPayment = new PayPalPayment(10, "PippoPappa@gmail.com");
        PaymentProcessor<PayPalPayment> PPProcess = new PayPalProcessor();
        PaymentService<PayPalPayment> PPService = new PaymentService<>(PPProcess);

        PPService.executeTransaction(PPPayment);
    }
}
