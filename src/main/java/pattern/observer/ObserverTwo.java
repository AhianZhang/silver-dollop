package pattern.observer;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/10 3:25 PM
 **/
public class ObserverTwo implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("observer two is received" + msg);
    }
}
