package pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
class InstallSoftwareTest {

    @Test
    void install() {


        InstallSoftware mac = new InstallSoftware();
        mac.install(new Wizard());
    }
}