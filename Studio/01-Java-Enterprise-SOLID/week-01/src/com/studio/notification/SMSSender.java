package com.studio.notification;

public class SMSSender implements NotificationSender<SMSNotification> {
    @Override
    public void send(SMSNotification notification) {
        System.out.println("Invio SMS a: " + notification.getRecipient());
        System.out.println("Messaggio: " + notification.getMessage());
        System.out.println("--- SMS INVIATO CON SUCCESSO ---");
    }
}
