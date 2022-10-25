import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/7/21 17:13
 **/
public class Test66 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            System.out.println(scanner.next());
//        }
//        System.out.println(new Object().hashCode());
//        System.out.println(new Object().hashCode());

        Flux.range(1, 10)
                .parallel(2)
                .runOn(Schedulers.parallel())
//                .sequential()
                .subscribe(i -> System.out.println(Thread.currentThread().getName() + " -> " + i));

    }
}
