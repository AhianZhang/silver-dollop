package spring.el;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/9/28 09:51
 **/
public class Main {
    public static void main(String[] args) {
        ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("price * 0.8");
        Order order = new Order();
        order.setPrice(BigDecimal.TEN);
        BigDecimal value = expression.getValue(order, BigDecimal.class);
        System.out.println(value);
        List<Order> orders = new ArrayList<>() {{
            //年龄19，不是新客，周一下单，金额11
            add(new Order("张三", 19, false, LocalDate.of(2020, 11, 9), new BigDecimal(11)));
            //年龄17，是新客，周五下单，金额19
            add(new Order("李四", 17, true, LocalDate.of(2020, 11, 13), new BigDecimal(19)));
            //年龄17，不是新客，周六下单，金额9
            add(new Order("王五", 17, true, LocalDate.of(2020, 11, 14), new BigDecimal(9)));
        }};

        Map<String, Expression> expressionCache = new HashMap<String, Expression>();

        System.out.println("结算rule1");
        List<String> filterRule1 =
                Arrays.asList("orderDate.getDayOfWeek().getValue() == 1 || orderDate.getDayOfWeek().getValue() == 5", "isNew");
        String settleRule1 = "price * 0.2";
        settle(orders, filterRule1, settleRule1, expressionCache);

        System.out.println("结算rule2");
        List<String> filterRule2 = Arrays.asList("age > 18", "price > 10");
        String settleRule2 = "(price - 10) * 0.8";
        settle(orders, filterRule2, settleRule2, expressionCache);
    }
    public static void settle(List<Order> orders, List<String> filterRule,
                              String settleRule, Map<String, Expression> expressionCache) {
        Stream<Order> stream = orders.stream();
        ExpressionParser expressionParser = new SpelExpressionParser();
        for (String rule : filterRule) {
            Expression expression = cacheFunction(s -> expressionParser.parseExpression(s), rule, expressionCache);
            stream = filter(stream, expression);
        }
        Expression expression = cacheFunction(s -> expressionParser.parseExpression(s), settleRule, expressionCache);
        stream.forEach(o -> System.out.println(o.getUserId() + expression.getValue(o)));
    }

    public static <T> Stream<T> filter(Stream<T> stream, Expression expression) {
        return stream.filter(s -> expression.getValue(s, Boolean.class));
    }

    public static <T, R> R cacheFunction(Function<T, R> function, T t, Map<T, R> cache) {
        R r = cache.get(t);
        if (r != null) return r;
        R result = function.apply(t);
        cache.put(t,result);
        return result;
    }


}
