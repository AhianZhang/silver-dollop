package pattern.state;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/30 11:48 AM
 **/
public class Main {


    public static void main(String[] args) {

        State state = new State();
        Context context = new Context(state);

        state.setValue("state2");
        context.method();

    }
}
