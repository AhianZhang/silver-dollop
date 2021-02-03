package pattern.strategy;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019/12/10 3:13 PM
 **/
public class MD5Encryption extends CryptoMethod implements Encryption {
    @Override
    public void crypto(String txt) {
        crypto("MD5 crypto"+ txt);

    }
}
