package _4_QuanLyThuVien;

interface Book {
    void read();
}

class PaperBook implements Book {
    public void read() {
        System.out.println("Đọc sách giấy");
    }
}

public class BookFactory {
    public static Book createBook(String type) {
        if (type.equals("paper"))
            return new PaperBook();
        return null;
    }
}
//Factory Method – Tạo sách