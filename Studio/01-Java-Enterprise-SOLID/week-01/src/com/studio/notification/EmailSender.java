package com.studio.notification;

public class EmailSender implements NotificationSender<EmailNotification> {
    @Override
    public void send(EmailNotification notification) {
        System.out.println("Invio EMAIL a: " + notification.getRecipient());
        System.out.println("Oggetto: " + notification.getSubject());
        System.out.println("Messaggio: " + notification.getMessage());
        System.out.println("--- EMAIL INVIATA CON SUCCESSO ---");
    }
}
