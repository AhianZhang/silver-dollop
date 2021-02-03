package java8.functional;

import java.math.BigDecimal;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 11/18/20 10:25 AM
 **/
public class ProductItem {
    private String name;
    private BigDecimal price;

    public ProductItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
