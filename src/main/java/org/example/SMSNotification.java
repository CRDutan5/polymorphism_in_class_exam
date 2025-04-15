package org.example;

public class SMSNotification extends Notification {

    public SMSNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.println("Sending to: " + getRecipient());
        System.out.println("SMS content: " + getMessage());
        System.out.println("Connecting to SMS gateway...");
        System.out.println("Sending SMS...");
    }
 
}