package java8.functional;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 11/18/20 9:46 AM
 **/
public class Address {
    private String province;
    private String location;

    public Address(String province, String location) {
        this.province = province;
        this.location = location;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
