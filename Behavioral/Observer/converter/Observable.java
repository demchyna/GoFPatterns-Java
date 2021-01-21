package converter;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public Subscription subscribe(Observer observer) {
        observers.add(observer);
        return new Subscription(observers, observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
