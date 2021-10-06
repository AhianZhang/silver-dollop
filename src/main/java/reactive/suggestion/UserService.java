package reactive.suggestion;

import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2021/7/9 11:20 AM
 **/
public class UserService {

    public static final String MATCHED = "1";

    public List<String> getFavorites(String userId){
        if (MATCHED.equalsIgnoreCase(userId)){
            return null;
        }else {
            return Collections.singletonList("ball");
        }
    }
}
