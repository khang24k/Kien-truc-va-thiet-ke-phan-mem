package _1_Singleton_Ex;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    // Constructor private
    private DatabaseConnection() {
        System.out.println("Database connected");
    }

    // Lấy instance duy nhất
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing: " + sql);
    }
}
