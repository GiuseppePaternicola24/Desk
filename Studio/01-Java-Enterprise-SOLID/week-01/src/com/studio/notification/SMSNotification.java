package com.studio.notification;

public class SMSNotification implements Notification {
    // Rendiamo i campi final per garantire che l'oggetto sia immutabile (Best
    // Practice)
    private final String phoneNumber;
    private final String text;

    public SMSNotification(String phoneNumber, String text) {
        this.phoneNumber = phoneNumber;
        this.text = text;
    }

    @Override
    public String getRecipient() {
        return phoneNumber; // Per gli sms, il destinatario è il numero di telefono
    }

    @Override
    public String getMessage() {
        return text; // Il messaggio vero e proprio è il testo dell'sms
    }
}
