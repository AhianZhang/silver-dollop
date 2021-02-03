package pattern;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-09-10 15:02
 **/
public class SLP {
    public static void main(String[] args) {
        Soldier ahian = new Soldier();
        ahian.givenGun(new MachineGun());
        ahian.killed();
    }

}

abstract class AbstractGun {

    public abstract void shot();
}

class Handgun extends AbstractGun {

    @Override
    public void shot() {
        System.out.println("手枪射击...");
    }
}

class Rifle extends AbstractGun {
    @Override
    public void shot() {
        System.out.println("步枪射击...");
    }
}

class MachineGun extends AbstractGun {
    @Override
    public void shot() {
        System.out.println("机枪扫射...");
    }
}

class Soldier {
    private AbstractGun gun;

    public void givenGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killed(){
        System.out.println("开始杀敌");
        gun.shot();
    }
}
