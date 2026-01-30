package _2_ObserverDesignPattern;

public class Main {

	public static void main(String[] args) {
        Subject stock = new Subject();
        stock.attach(new Investor("A"));
        stock.attach(new Investor("B"));

        stock.notifyAllObservers("Giá cổ phiếu tăng!");
    }

}
