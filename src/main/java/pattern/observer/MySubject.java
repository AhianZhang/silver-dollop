package pattern.observer;

import java.util.Scanner;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/10 3:31 PM
 **/
public class MySubject extends AbstractSubject {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void operation() {
        String next = scanner.next();
        System.out.println("update self");
        notifyObserver(next);
    }
}
