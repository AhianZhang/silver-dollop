package pattern.observer;

import java.util.*;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/10 3:27 PM
 **/
public abstract class AbstractSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {

        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String msg) {

        for (Observer observer : observers) {
            observer.update(msg);
        }

    }

}
