package java8.functional;

import java.util.List;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 11/17/20 2:22 PM
 **/
public class Product {
    private  Address  address;

    private List<ProductItem> productItems;


    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<ProductItem> getProductItems() {
        return productItems;
    }

    public void setProductItems(List<ProductItem> productItems) {
        this.productItems = productItems;
    }

    @Override
    public String toString() {
        return "Product{" +
                "address=" + address +
                ", productItems=" + productItems +
                '}';
    }
}
