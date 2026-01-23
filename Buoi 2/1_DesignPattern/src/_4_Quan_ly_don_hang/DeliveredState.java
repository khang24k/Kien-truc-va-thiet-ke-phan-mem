package _4_Quan_ly_don_hang;

public class DeliveredState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Đơn hàng đã được giao thành công.");
    }
}
