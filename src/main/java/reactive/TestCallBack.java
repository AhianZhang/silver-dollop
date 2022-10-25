package reactive;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/8/23 19:56
 **/
public class TestCallBack {
    public static void main(String[] args) {
        TestCallBack testCallBack = new TestCallBack();
        testCallBack.testCallBack(new CallBack() {
            @Override
            public void execute() {
                System.out.println("callback");
            }
        });
    }
    private void testCallBack(CallBack callBack){

        callBack.execute();
    }
}
