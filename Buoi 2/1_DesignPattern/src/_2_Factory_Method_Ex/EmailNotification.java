package _2_Factory_Method_Ex;

public class EmailNotification implements Notification {
    public void send() {
        System.out.println("Sending Email notification");
    }
}
