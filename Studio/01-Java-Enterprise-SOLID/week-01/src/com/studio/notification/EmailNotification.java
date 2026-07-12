package com.studio.notification;

public class EmailNotification implements Notification {
    // Rendiamo i campi final per garantire che l'oggetto sia immutabile (Best
    // Practice)
    private final String emailAddress;
    private final String subject;
    private final String body;

    public EmailNotification(String emailAddress, String subject, String body) {
        this.emailAddress = emailAddress;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public String getRecipient() {
        return emailAddress; // Per le email, il destinatario è l'indirizzo email
    }

    @Override
    public String getMessage() {
        return body; // Il messaggio vero e proprio è il corpo dell'email
    }

    // Aggiungiamo un getter specifico per l'oggetto dell'email
    public String getSubject() {
        return subject;
    }
}
