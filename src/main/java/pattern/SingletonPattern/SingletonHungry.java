package pattern.SingletonPattern;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/7/25 10:44 PM
 **/
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();

    private  SingletonHungry(){
    }

    public static SingletonHungry getInstance() {
        return instance;
    }
}
