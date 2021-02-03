package pattern.bridge;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/10 2:47 PM
 **/
public class MySqlDatabase implements DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("mysql connected");
    }
}
