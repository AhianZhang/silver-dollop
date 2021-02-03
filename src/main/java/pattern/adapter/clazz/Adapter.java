package pattern.adapter.clazz;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/30 11:56 AM
 **/
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {

        System.out.println("method 2");
    }

}
