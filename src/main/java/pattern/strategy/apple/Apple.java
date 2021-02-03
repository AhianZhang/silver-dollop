package pattern.strategy.apple;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/11/4 2:25 PM
 **/
public class Apple {
    private String color;
    public Apple(String color, String weight) {
        this.color = color;
        this.weight = weight;
    }

    private String weight;

    public Apple() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
