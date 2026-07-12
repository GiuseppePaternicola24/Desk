package com.studio.notification;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- AVVIO SISTEMA DI NOTIFICHE ---\n");

        // 1. Esempio Email
        EmailNotification email = new EmailNotification(
                "studente@universita.it",
                "Inizio Settimana 1",
                "Benvenuto nello studio di Java Enterprise e OOP!");
        // Istanziamo la strategia e la iniettiamo nel servizio
        NotificationSender<EmailNotification> emailSender = new EmailSender();
        NotificationService<EmailNotification> emailService = new NotificationService<>(emailSender);

        emailService.processAndSend(email);

        // 2. Esempio SMS
        SMSNotification sms = new SMSNotification(
                "+39 333 1234567",
                "Ricordati di completare l'esercizio pratico di Java!");
        NotificationSender<SMSNotification> smsSender = new SMSSender();
        NotificationService<SMSNotification> smsService = new NotificationService<>(smsSender);

        smsService.processAndSend(sms);

        // 3. Esempio Push
        PushNotification push = new PushNotification(
                "DEVICE_TOKEN_XYZ123",
                "{\"title\":\"Nuovo messaggio\", \"badge\": 1}");
        NotificationSender<PushNotification> pushSender = new PushSender();
        NotificationService<PushNotification> pushService = new NotificationService<>(pushSender);

        pushService.processAndSend(push);
    }
}
