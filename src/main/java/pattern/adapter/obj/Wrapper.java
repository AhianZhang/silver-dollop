package pattern.adapter.obj;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/30 11:56 AM
 **/
public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source) {
        this.source = source;
    }

    @Override
    public void rootMethod() {
        source.rootMethod();
    }

    @Override
    public void method2() {
        System.out.println("method 2");
    }

}
