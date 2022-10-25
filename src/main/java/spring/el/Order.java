package spring.el;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/9/27 17:38
 **/
public class Order {
    private String userId;
    private Integer age;
    //是否是新客
    private Boolean isNew;
    private LocalDate orderDate;
    private BigDecimal price;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Order() {
    }

    public Order(String userId, Integer age, Boolean isNew, LocalDate orderDate, BigDecimal price) {
        this.userId = userId;
        this.age = age;
        this.isNew = isNew;
        this.orderDate = orderDate;
        this.price = price;
    }
}