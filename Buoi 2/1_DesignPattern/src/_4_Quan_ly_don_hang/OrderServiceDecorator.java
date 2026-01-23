package _4_Quan_ly_don_hang;

public abstract class OrderServiceDecorator implements OrderService {
    protected OrderService orderService;

    public OrderServiceDecorator(OrderService orderService) {
        this.orderService = orderService;
    }
}
