package _4_QuanLyThuVien;

interface SearchStrategy {
    void search();
}

public class SearchByName implements SearchStrategy {
    public void search() {
        System.out.println("Tìm theo tên");
    }
}
//Strategy – Tìm kiếm