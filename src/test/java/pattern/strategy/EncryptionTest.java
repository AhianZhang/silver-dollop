package pattern.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EncryptionTest {

    @Test
    void crypto() {
        Encryption encryption = new MD5Encryption();
        encryption.crypto("test ");

    }
}