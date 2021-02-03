package pattern.observer;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/13 10:38 AM
 **/
public class Main {
    public static void main(String[] args) {
        Subject subject = new MySubject();
        subject.add(new ObserverOne());
        subject.add(new ObserverTwo());
        subject.operation();
    }
}
