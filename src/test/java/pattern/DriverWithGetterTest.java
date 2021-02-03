package pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverWithGetterTest {



    @Test
    void drive() {

        ICar car = new BenZ();

        IDriverSetter driver = new DriverWithGetter();

        driver.setCar(car);
        driver.drive();
    }
}