package java8.ref;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射
 * @author ahianzhang
 * @version 1.0
 * @date 2021/10/6 8:47 PM
 **/
public class ReflectionDemo {

    private String name = "ahian";
    private void sayHello(String name){
        System.out.println("hello" + name);
    }
    public void sayHello1(String name){
        System.out.println("hello" + name);
    }

}
class ReflectionMain{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class rf = Class.forName("java8.ref.ReflectionDemo");
        ReflectionDemo reflectionDemo = (ReflectionDemo) rf.newInstance();
        Method sayHello1 = rf.getDeclaredMethod("sayHello1", String.class);
        Object ahian = sayHello1.invoke(reflectionDemo, "ahian");
        Method sayHello = rf.getDeclaredMethod("sayHello", String.class);
        sayHello.setAccessible(true);
        sayHello.invoke(reflectionDemo,"zhang");
    }
}

