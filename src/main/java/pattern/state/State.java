package pattern.state;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/30 11:44 AM
 **/
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("first method +++");
    }
    public void method2(){
        System.out.println("second method ---");
    }
}
