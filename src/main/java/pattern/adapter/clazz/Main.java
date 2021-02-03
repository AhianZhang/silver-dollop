package pattern.adapter.clazz;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/30 11:57 AM
 **/
public class Main {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.rootMethod();
        target.method2();
    }
}
