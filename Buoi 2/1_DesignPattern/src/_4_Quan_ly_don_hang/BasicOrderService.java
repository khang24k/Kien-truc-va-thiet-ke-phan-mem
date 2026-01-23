package _4_Quan_ly_don_hang;

public class BasicOrderService implements OrderService {
    private Order order;

    public BasicOrderService(Order order) {
        this.order = order;
    }

    public void execute() {
        order.process();
    }
}

