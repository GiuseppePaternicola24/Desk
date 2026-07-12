package com.studio.payment;

/**
 * Servizio di alto livello che coordina la transazione di pagamento.
 * Utilizza la Dependency Injection per ricevere la strategia corretta (il processore) 
 * senza accoppiarsi a una tecnologia di pagamento specifica.
 *
 * @param <T> il tipo di pagamento gestito da questa istanza del servizio
 */
public class PaymentService<T extends Payment> {

    // Dipendenza dall'astrazione del processore.
    // Viene dichiarata final per garantire l'immutabilità dopo l'iniezione.
    private final PaymentProcessor<T> sender;

    /**
     * Costruttore per la Dependency Injection del processore specifico.
     */
    public PaymentService(PaymentProcessor<T> sender) {
        this.sender = sender;
    }

    /**
     * Esegue l'orchestrazione del pagamento: stampa l'inizio, delega l'elaborazione 
     * reale al processore iniettato e notifica la fine della transazione.
     *
     * @param payment l'oggetto pagamento contenente i dati della transazione
     */
    public void executeTransaction(T payment) {
        System.out.println("[PaymentService] Elaborazione pagamento...");

        // Delegazione: il servizio delega la logica specifica al processore
        sender.process(payment);

        System.out.println("[PaymentService] Processo terminato con successo.");
        System.out.println("==================================================\n");
    }
}
