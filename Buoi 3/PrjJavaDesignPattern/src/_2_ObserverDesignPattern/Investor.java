package _2_ObserverDesignPattern;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " nhận thông báo: " + message);
    }
}
