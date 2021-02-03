package pattern.template;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/10/19 5:10 PM
 **/
public class Main {
    public static void main(String[] args) {
        PasswordGrant grant = new PasswordGrant();
        grant.grant();
        grant.issueToken();
    }
}
