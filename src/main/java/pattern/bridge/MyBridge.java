package pattern.bridge;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/10 2:50 PM
 **/
public class MyBridge extends AbstractDbBridge {


    @Override
    public void connect() {
      getConnector().connect();
    }
}
