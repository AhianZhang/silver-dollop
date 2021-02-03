package pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class DriverTest {


    @Test
    void drive() {
        ICar car = mock(ICar.class);
        IDriver ahian  = new Driver();
        //verify(car).run();

        ahian.drive(car);
    }
}