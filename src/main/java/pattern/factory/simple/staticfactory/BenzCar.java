package pattern.factory.simple.staticfactory;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-11-25 15:42
 **/
public class BenzCar implements CarCreater {
    @Override
    public void create() {
        System.out.println("奔驰车");
    }
}
