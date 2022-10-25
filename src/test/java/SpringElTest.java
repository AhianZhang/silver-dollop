import org.junit.jupiter.api.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/10/25 10:13
 **/
public class SpringElTest {
    @Test
    void test_boolean_match_normal(){
        Expression expr = new SpelExpressionParser().parseRaw("(#categorySid==123 || #categorySid==456 ) &&  #userSid==123");
        StandardEvaluationContext exprContext = new StandardEvaluationContext();
        Map<String, Object> map = new HashMap<>();
        map.put("categorySid",456);
        map.put("userSid",1234);
        exprContext.setVariables(map);
        boolean matched = (boolean) expr.getValue(exprContext);
        System.out.println(matched);
    }

    @Test
    void test_boolean_match_contains(){
        Expression expr = new SpelExpressionParser().parseRaw("{1446,1066}.contains(#firstCategorySid) && {234}.contains(#userSid)");
        StandardEvaluationContext exprContext = new StandardEvaluationContext();
        Map<String, Object> map = new HashMap<>();
        Long a = 1446L;
        map.put("firstCategorySid",a.intValue());
        map.put("userSid",234);
        exprContext.setVariables(map);
        boolean matched = (boolean) expr.getValue(exprContext);
        System.out.println(matched);
    }
}
