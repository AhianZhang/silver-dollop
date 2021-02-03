package pattern.bridge;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/10 2:48 PM
 **/
public abstract class AbstractDbBridge {
    private DatabaseConnector connector;

    public void connect(){
        connector.connect();
    }

    public DatabaseConnector getConnector() {
        return connector;
    }

    public void setConnector(DatabaseConnector connector) {
        this.connector = connector;
    }
}
