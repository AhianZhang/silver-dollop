package reactive;

import reactor.core.publisher.Flux;
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

    public static void main(String[] args) {
        Flux.just("1","2").subscribe(System.out::println);
        Flux.error(new Exception()).subscribe(System.out::println);
    }

}
