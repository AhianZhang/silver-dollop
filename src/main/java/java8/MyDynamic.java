package java8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/9/9 11:39 AM
 **/
public class MyDynamic {


}
interface HelloService{
    void sayHello();
}
class Hello implements HelloService{

    @Override
    public void sayHello() {
        System.out.println("Hello world");
    }
}
class HelloDynamicProxy implements InvocationHandler {
    private Object target;

    public HelloDynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("get proxy method");
        Object invoke = method.invoke(target, args);
        return invoke;
    }

    public static void main(String[] args) {
        HelloService helloService = new Hello();
        HelloDynamicProxy helloDynamicProxy = new HelloDynamicProxy(helloService);
        HelloService hello = (HelloService) Proxy.newProxyInstance(Hello.class.getClassLoader(), Hello.class.getInterfaces(), helloDynamicProxy);

        hello.sayHello();
    }
}
