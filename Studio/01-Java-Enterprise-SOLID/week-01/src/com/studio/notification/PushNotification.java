package com.studio.notification;

public class PushNotification implements Notification {
    // Rendiamo i campi final per garantire che l'oggetto sia immutabile (Best
    // Practice)
    private final String deviceToken;
    private final String payload;

    public PushNotification(String deviceToken, String payload) {
        this.deviceToken = deviceToken;
        this.payload = payload;
    }

    @Override
    public String getRecipient() {
        return deviceToken; // Per le push, il destinatario è il token del dispositivo
    }

    @Override
    public String getMessage() {
        return payload; // Il messaggio vero e proprio è il payload della push
    }
}
