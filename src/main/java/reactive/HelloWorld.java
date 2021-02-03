package reactive;

import reactor.core.publisher.Mono;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/8/10 2:31 PM
 **/
public class HelloWorld {

    public Mono<String> sayHello(){
        return Mono.empty();
    }
}
