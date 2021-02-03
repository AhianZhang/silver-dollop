package pattern.SingletonPattern;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-09-11 11:48
 **/
public class SingletonPattern {


}
class Emperor{
    private final static  Emperor emperor = new Emperor();


    private Emperor() {
    }

    static Emperor getInstance(){
        return emperor;
    }

    public static void say(){
        System.out.println("I am ahian");
    }

}

class Minister{
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {

           // Emperor emperor = Emperor.getInstance();
            Emperor.say();
        }
    }
}