package algorihtm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/11/11 4:41 PM
 **/
public class aaTest {
    @Test
    void name() {
        String mobiles =  "15731693317,18561303172";
        String[] split = mobiles.split(",");
        List<String> collect = Arrays.stream(split).map(s -> "\"".concat(s).concat("\"")).collect(Collectors.toList());


        System.out.println(collect);

    }
}
