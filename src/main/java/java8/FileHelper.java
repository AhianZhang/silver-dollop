package java8;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 11/16/20 2:19 PM
 **/
public class FileHelper {
    public static void main(String[] args) throws IOException {
        String s = "Hello World";

        OutputStream out = null;
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                out.write("ssss".getBytes());
            }
        });
        objectOutputStream.writeObject(s);
    }
}
