package com.studio.payment;

/**
 * Interfaccia generica per i processori di pagamento.
 * Utilizza un parametro generico <T> vincolato a essere una sottoclasse di Payment.
 * Questo assicura che il processore tratti solo il tipo di pagamento corretto.
 *
 * @param <T> il tipo specifico di pagamento (deve estendere Payment)
 */
public interface PaymentProcessor<T extends Payment> {
    
    /**
     * Elabora il pagamento specifico.
     * @param payment il pagamento da processare.
     */
    void process(T payment);
}
