package pattern.state;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/30 11:45 AM
 **/
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void method(){
        if (state.getValue().equals("state1")){
            state.method1();
        }else if (state.getValue().equals("state2")){
            state.method2();
        }
    }
}
