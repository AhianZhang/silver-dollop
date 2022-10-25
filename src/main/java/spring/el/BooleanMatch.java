package spring.el;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/10/13 15:29
 **/
public class BooleanMatch {
    public static void main(String[] args) {
        Expression expr = new SpelExpressionParser().parseRaw("(#categorySid==123 || #categorySid==456 ) &&  #userSid==123");
        StandardEvaluationContext exprContext = new StandardEvaluationContext();
        Map<String, Object> map = new HashMap<>();
        map.put("categorySid",456);
        map.put("userSid",1234);
        exprContext.setVariables(map);
        boolean matched = (boolean) expr.getValue(exprContext);
        System.out.println(matched);
    }
}
