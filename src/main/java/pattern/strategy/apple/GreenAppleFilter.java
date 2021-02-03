package pattern.strategy.apple;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/11/4 2:34 PM
 **/
public class GreenAppleFilter implements AppleFilter{
    @Override
    public boolean filter(Apple apple) {
        if (apple.getColor().equals("green")){
            return true;
        }
        return false;
    }
}
