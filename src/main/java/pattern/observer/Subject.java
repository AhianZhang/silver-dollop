package pattern.observer;

public interface Subject {

    void add(Observer observer);
    void remove(Observer observer);
    void notifyObserver(String msg);

    void operation();
}
