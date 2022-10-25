package pattern.chain;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/10/25 15:49
 **/
public class StdProcessor implements Processor {
    @Override
    public void process(String input) {
        System.out.println(input + "标准输出");
    }
}
