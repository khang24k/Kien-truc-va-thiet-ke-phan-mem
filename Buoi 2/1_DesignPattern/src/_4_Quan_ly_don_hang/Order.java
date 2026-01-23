package _4_Quan_ly_don_hang;

public class Order {
    private OrderState state;
    private RefundStrategy refundStrategy;

    public Order() {
        state = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void setRefundStrategy(RefundStrategy refundStrategy) {
        this.refundStrategy = refundStrategy;
    }

    public void process() {
        state.handle(this);
    }

    public void refund() {
        if (refundStrategy != null) {
            refundStrategy.refund();
        }
    }
}

