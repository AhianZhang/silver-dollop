package pattern.adapter.obj;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/30 11:57 AM
 **/
public class Main {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.rootMethod();
        target.method2();
    }
}
