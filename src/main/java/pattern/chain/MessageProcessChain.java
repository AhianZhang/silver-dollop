package pattern.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/10/25 15:52
 **/
public class MessageProcessChain {
    List<Processor> chains = new ArrayList<>();

    public MessageProcessChain addChain(Processor processor){
        chains.add(processor);
        return this;
    }
    public void process(String message){
        chains.forEach(item -> item.process(message));
    }
}
