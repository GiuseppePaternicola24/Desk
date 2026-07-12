package com.studio.notification;

public interface NotificationSender<T extends Notification> {
    void send(T notification);
}
