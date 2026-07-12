package com.studio.payment;

/**
 * Interfaccia comune per tutti i tipi di pagamento.
 * Definisce i metodi fondamentali che ogni pagamento deve implementare.
 */
public interface Payment {
    
    /**
     * Restituisce l'importo del pagamento.
     * @return il saldo/ammontare come double.
     */
    double getAmount();

    /**
     * Restituisce i dettagli specifici del pagamento sotto forma di stringa.
     * Ogni tipo di pagamento (carta, crypto, PayPal) personalizzerà questo output.
     * @return stringa contenente i dettagli.
     */
    String getDetails();
}
