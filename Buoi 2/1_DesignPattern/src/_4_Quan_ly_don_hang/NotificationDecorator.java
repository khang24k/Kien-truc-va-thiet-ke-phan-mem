package _4_Quan_ly_don_hang;

public class NotificationDecorator extends OrderServiceDecorator {
    public NotificationDecorator(OrderService orderService) {
        super(orderService);
    }

    public void execute() {
        orderService.execute();
        System.out.println("Gửi thông báo cho khách hàng.");
    }
}
