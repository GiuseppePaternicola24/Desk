package com.studio.notification;

public class PushSender implements NotificationSender<PushNotification> {
    @Override
    public void send(PushNotification notification) {
        System.out.println("Invio Push a: " + notification.getRecipient());
        System.out.println("Messaggio: " + notification.getMessage());
        System.out.println("--- PUSH INVIATO CON SUCCESSO ---");
    }
}
