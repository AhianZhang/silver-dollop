package pattern.observer;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/10 3:24 PM
 **/
public class ObserverOne implements Observer{
    @Override
    public void update(String msg) {
        System.out.println("observer one is received" + msg);
    }
}
