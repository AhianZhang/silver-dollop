package pattern.chain;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/10/25 15:48
 **/
public class Main {
    public static void main(String[] args) {
        String msg = "ahian";
        MessageProcessChain chain = new MessageProcessChain()
                .addChain(new JsonProcessor())
                .addChain(new StdProcessor());
        chain.process(msg);
    }
}
