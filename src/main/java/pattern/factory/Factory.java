package pattern.factory;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-09-11 14:11
 **/
public class Factory {

}


interface Human{
    public void getColor();

    public void talk();
}

class BlackHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("black man");
    }

    @Override
    public void talk() {

        System.out.println("africa language");
    }
}

class WhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("white  man");
    }

    @Override
    public void talk() {
        System.out.println("american");
    }
}

class YelloHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("yellow man");
    }

    @Override
    public void talk() {
        System.out.println("chinese");
    }
}

abstract class AbstractHumanFactory<T> {
    public abstract T createHuman(Class c);
}
@SuppressWarnings("unchecked")
class HumanFactory<T> extends AbstractHumanFactory{
    @Override
    public T createHuman(Class c) {
        Human human = null;
        try {

        human = (Human) Class.forName(c.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) human;

    }

}

class NvWa{
    public static void main(String[] args) {
        AbstractHumanFactory yinyanglu = new HumanFactory();

        Human human = (Human) yinyanglu.createHuman(WhiteHuman.class);

        human.getColor();
        human.talk();
        System.out.println();
    }
}