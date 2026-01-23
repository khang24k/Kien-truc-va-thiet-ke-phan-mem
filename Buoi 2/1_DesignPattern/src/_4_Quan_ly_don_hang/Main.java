package _4_Quan_ly_don_hang;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setRefundStrategy(new BankRefund());

        OrderService service =
            new NotificationDecorator(
                new LoggingDecorator(
                    new BasicOrderService(order)
                )
            );

        service.execute(); // New → Processing
        service.execute(); // Processing → Delivered
    }
}

