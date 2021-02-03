package pattern;


/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-09-10 17:13
 **/
public class DIP {

    public static void main(String[] args) {
        ICar ben = new BenZ();
        IDriver ahian = new Driver();
        ahian.drive(ben);
    }
}

interface ICar {
    void run();
}

interface IDriver {
    void drive(ICar car);
}

interface IDriverNoArgs {
    void drive();
}

interface IDriverSetter {
    void setCar(ICar car);

    void drive();
}


class BenZ implements ICar {

    @Override
    public void run() {
        System.out.println("奔驰车启动。。。。");
    }
}

class Bmw implements ICar {
    @Override
    public void run() {

        System.out.println("宝马车启动。。。。");
    }
}

class Driver implements IDriver {

    @Override
    public void drive(ICar car) {
        System.out.println("司机进入");
        car.run();
    }
}

class DriverWithConstructure implements IDriverNoArgs {
    private ICar car;

    DriverWithConstructure(ICar car) {
        this.car = car;
    }


    @Override
    public void drive() {
        System.out.println("通过构造方法进入");
        car.run();
    }
}

class DriverWithGetter implements IDriverSetter {

    private ICar car;

    @Override
    public void setCar(ICar car) {
        System.out.println("开"+ car.getClass().getSimpleName()+"车");
        this.car = car;
    }

    @Override
    public void drive() {

        System.out.println("Setter方式开车");
        car.run();

    }
}