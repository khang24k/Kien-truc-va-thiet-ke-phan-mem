package _4_Quan_ly_don_hang;

public class NewOrderState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Kiểm tra thông tin đơn hàng...");
        order.setState(new ProcessingState());
    }
}
