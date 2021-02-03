package pattern.strategy;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/10 3:14 PM
 **/
public class Sha256Encryption extends CryptoMethod implements Encryption {
    @Override
    public void crypto(String txt) {
        crypto("SHA256" + txt);
    }
}
