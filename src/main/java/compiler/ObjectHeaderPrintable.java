package compiler;


import org.openjdk.jol.info.ClassLayout;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2/8/21 10:17 AM
 **/
public class ObjectHeaderPrintable {

    public static void main(String[] args) {
        ObjectHeaderPrintable objectHeaderPrintable = new ObjectHeaderPrintable();

        System.out.println(ClassLayout.parseInstance(objectHeaderPrintable).toPrintable());
    }
}

class T{

    boolean a = false;
}
