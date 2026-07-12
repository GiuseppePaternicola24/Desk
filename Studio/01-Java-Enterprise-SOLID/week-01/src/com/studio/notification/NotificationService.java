package com.studio.notification;

/*
  Servizio generico per l'elaborazione e l'invio delle notifiche.
  Applica lo Strategy Pattern e la Dependency Injection.
*/

public class NotificationService<T extends Notification> {

    // Composizione: Il servizio HA UN mittente generico.
    private final NotificationSender<T> sender;

    // Dependency Injection: Iniettiamo il sender dall'esterno tramite costruttore
    public NotificationService(NotificationSender<T> sender) {
        this.sender = sender;
    }

    public void processAndSend(T notification) {
        System.out.println("[NotificationService] Inizio elaborazione notifica...");

        // Delegazione: Il servizio delega l'invio effettivo alla strategia iniettata
        sender.send(notification);

        System.out.println("[NotificationService] Processo terminato con successo.");
        System.out.println("==================================================\n");
    }
}
