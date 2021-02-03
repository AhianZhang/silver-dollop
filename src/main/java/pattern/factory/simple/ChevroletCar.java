package pattern.factory.simple;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-11-25 15:45
 **/
public class ChevroletCar implements CarCreater {
    @Override
    public void create() {
        System.out.println("雪弗兰");
    }
}
