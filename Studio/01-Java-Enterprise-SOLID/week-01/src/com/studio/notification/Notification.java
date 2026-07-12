package com.studio.notification;

public interface Notification {
    String getRecipient(); // Restituirà il destinatario (es. email, numero di telefono)

    String getMessage(); // Restituirà il contenuto del messaggio
}
