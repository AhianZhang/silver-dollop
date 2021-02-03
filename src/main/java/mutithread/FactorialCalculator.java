package mutithread;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-10-10 15:24
 **/
public class FactorialCalculator implements Callable<Integer>
{

    private Integer number;

    public FactorialCalculator(Integer number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        if ((number == 0) || (number == 1)) {
            result = 1;
        } else {
            for (int i = 2; i <= number; i++) {
                result *= i;
                TimeUnit.MILLISECONDS.sleep(20);
            }
        }
        System.out.println("Result for number - " + number + " -> " + result);
        return result;
    }
}
