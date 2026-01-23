package _2_Factory_Method_Ex;

public class Main {
    public static void main(String[] args) {
        Notification n1 = NotificationFactory.createNotification("EMAIL");
        n1.send();
        Notification n2 = NotificationFactory.createNotification("SMS");
        n2.send();
        
    }
}

//Hệ thống cần tạo nhiều loại thông báo:
//Email
//SMS
//Không muốn tạo object trực tiếp bằng new.
//
//Ý tưởng Factory Method
//Interface Notification
//Các class cụ thể: EmailNotification, SMSNotification
//Factory quyết định loại object được tạo