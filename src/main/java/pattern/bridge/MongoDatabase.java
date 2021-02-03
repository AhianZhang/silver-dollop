package pattern.bridge;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/10 2:48 PM
 **/
public class MongoDatabase implements DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("mongo connected");
    }
}
