package org.example;

public abstract class Notification {

    private String recipient;
    private String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    abstract void send();

    void displayInfo() {
        System.out.println("Recipient: " + recipient);
        System.out.println("Message: " + message);
    }

    public String getMessage() {
        return message;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}