package java8.ref;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2021/10/6 10:25 PM
 **/
public class ClassLoaderDemo extends ClassLoader {
    private String path;
    private String classLoaderName;

    public ClassLoaderDemo(String path, String classLoaderName) {
        this.path = path;
        this.classLoaderName = classLoaderName;
    }

    /**
     * 用于寻找类文件
     *
     * @param name
     * @return java.lang.Class<?>
     * @author ahianzhang
     * @date : 2021/10/6 10:27 PM
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] b = loadClassData(name);
        return defineClass(name, b, 0, b.length);
    }

    /**
     * 用于加载类文件
     *
     * @param name
     * @return byte[]
     * @author ahianzhang
     * @date : 2021/10/6 10:29 PM
     */
    private byte[] loadClassData(String name) {
        name = path + name + ".class";
        InputStream in = null;
        ByteArrayOutputStream out = null;

        try {
            in = new FileInputStream(new File(name));
            out = new ByteArrayOutputStream();
            int i = 0;
            while ((i = in.read())!= -1){
                out.write(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                out.close();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
        return out.toByteArray();
    }

    public static void main(String[] args) throws ClassNotFoundException {

        ClassLoaderDemo myClassLoader = new ClassLoaderDemo("/Users/ahianzhang/Documents/personal/coding/basic/src/main/java/java8/ref/", "MyClassLoader");
        Class<?> aa = myClassLoader.loadClass("java8.ref.HelloClassLoader");
        System.out.println(aa.getClassLoader());
    }
}
