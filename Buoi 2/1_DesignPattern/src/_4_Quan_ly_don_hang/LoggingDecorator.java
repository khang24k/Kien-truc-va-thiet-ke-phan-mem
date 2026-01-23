package _4_Quan_ly_don_hang;

public class LoggingDecorator extends OrderServiceDecorator {
    public LoggingDecorator(OrderService orderService) {
        super(orderService);
    }

    public void execute() {
        System.out.println("[LOG] Bắt đầu xử lý đơn hàng");
        orderService.execute();
        System.out.println("[LOG] Kết thúc xử lý đơn hàng");
    }
}

