package _1_Singleton_Ex;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        db1.query("SELECT * FROM users");

        System.out.println(db1 == db2); // true
    }
}
//Hệ thống cần quản lý kết nối cơ sở dữ liệu.
//Để tránh tốn tài nguyên, chỉ cho phép tồn tại 1 kết nối Database duy nhất trong suốt quá trình chạy chương trình.
//Ý tưởng áp dụng Singleton
//Class DatabaseConnection
//Constructor private
//Cung cấp phương thức getInstance() để lấy instance duy nhất