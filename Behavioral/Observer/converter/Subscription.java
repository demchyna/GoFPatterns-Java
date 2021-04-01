package converter;

import java.util.List;

public class Subscription {
    private List<Observer> observers;
    private Observer observer;

    public Subscription(List<Observer> observers, Observer observer) {
        this.observers = observers;
        this.observer = observer;
    }

    public void unsubscribe() {
        observers.remove(observer);
    }
}
