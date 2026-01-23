package _4_Quan_ly_don_hang;

public class ProcessingState implements OrderState {
    @Override
    public void handle(Order order) {
        System.out.println("Đóng gói và vận chuyển...");
        order.setState(new DeliveredState());
    }
}

