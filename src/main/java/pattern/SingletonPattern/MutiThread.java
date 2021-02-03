package pattern.SingletonPattern;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-09-11 12:14
 **/
public class MutiThread {
    public static void main(String[] args) {

    }

}
class Singleton{
    private  static Singleton singleton = null;

    private Singleton() {
    }

    public synchronized static Singleton getSingleton() {

        if (singleton == null){
            return new Singleton();
        }
        return singleton;
    }
}
