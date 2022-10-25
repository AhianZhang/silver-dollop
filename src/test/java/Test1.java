import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/8/1 13:16
 **/
public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Flux.just("1")
                .repeat()
                .delayElements(Duration.ofSeconds(1))
                .doOnNext(System.out::println)
                .subscribe();
        Thread.sleep(123333);
    }
}
