package reactive.suggestion;

import reactor.core.publisher.Mono;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2021/7/9 11:27 AM
 **/
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        SuggestionService suggestionService = new SuggestionService();
//        Mono.just(userService.getFavorites("1")).switchIfEmpty();
    }
}
