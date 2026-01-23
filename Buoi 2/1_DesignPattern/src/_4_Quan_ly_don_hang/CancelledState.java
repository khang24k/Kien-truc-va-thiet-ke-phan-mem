package _4_Quan_ly_don_hang;

public class CancelledState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Đơn hàng bị hủy.");
        order.refund();
    }
}
