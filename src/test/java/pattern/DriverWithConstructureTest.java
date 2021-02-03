package pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class DriverWithConstructureTest {

    @Test
    void drive() {

        ICar mockCar = mock(ICar.class);

        IDriverNoArgs ahian = new DriverWithConstructure(mockCar);

        ahian.drive();
    }
}