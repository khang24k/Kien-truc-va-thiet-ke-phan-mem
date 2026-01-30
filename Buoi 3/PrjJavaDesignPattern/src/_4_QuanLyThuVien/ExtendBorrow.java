package _4_QuanLyThuVien;

interface BorrowService {
    void borrow();
}

class BasicBorrow implements BorrowService {
    public void borrow() {
        System.out.println("Mượn sách cơ bản");
    }
}

public class ExtendBorrow extends BasicBorrow {
    public void borrow() {
        super.borrow();
        System.out.println("Gia hạn mượn");
    }
}