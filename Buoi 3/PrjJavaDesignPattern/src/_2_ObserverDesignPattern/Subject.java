package _2_ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer o) {
        observers.add(o);
    }

    public void notifyAllObservers(String msg) {
        for (Observer o : observers) {
            o.update(msg);
        }
    }
}
