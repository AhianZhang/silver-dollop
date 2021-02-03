package pattern.adapter.interfa;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/30 12:17 PM
 **/
public class Main {
    public static void main(String[] args) {
        Sourceable a = new SourceChildA();
        Sourceable b = new SourceChildB();
        a.method1();
        a.method2();
        b.method1();
        b.method2();
    }
}
