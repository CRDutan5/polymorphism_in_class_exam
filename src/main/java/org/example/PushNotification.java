package org.example;

public class PushNotification extends Notification {

    private String deviceToken;

    public PushNotification(String recipient, String message, String deviceToken) {
        super(recipient, message);
        this.deviceToken = deviceToken;
    }

    @Override
    public void send() {
        System.out.println("Sending to: " + getRecipient());
        System.out.println("Push notification content: " + getMessage());
        System.out.println("Connecting to push notification service...");
        System.out.println("Sending push notification...");
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
}
