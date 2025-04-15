package org.example;

public class EmailNotification extends Notification {

    public EmailNotification(String recipient, String message) {
        super(recipient, message);
    }

   @Override
    public void send() {
       System.out.println("Sending to: " + getRecipient());
       System.out.println("Email content: " + getMessage());
       System.out.println("Connecting to SMTP server...");
       System.out.println("Sending email...");
   }
}
