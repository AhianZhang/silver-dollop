package pattern.chain;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/10/25 15:50
 **/
public class JsonProcessor implements Processor {
    @Override
    public void process(String input) {
        System.out.println(String.format("{\"name\":\"%s\"}", input));
    }
}
