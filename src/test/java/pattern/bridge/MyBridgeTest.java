package pattern.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MyBridgeTest {

    @Test
    void connect() {
        AbstractDbBridge bridge = new MyBridge();



        DatabaseConnector mySqlDatabase = new MySqlDatabase();
        bridge.setConnector(mySqlDatabase);
        bridge.connect();

        DatabaseConnector mongoDatabase = new MongoDatabase();

        bridge.setConnector(mongoDatabase);

        bridge.connect();
    }
}