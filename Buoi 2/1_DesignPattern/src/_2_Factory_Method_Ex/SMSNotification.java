package _2_Factory_Method_Ex;

public class SMSNotification implements Notification {
    public void send() {
        System.out.println("Sending SMS notification");
    }
}