package java8.functional;

@FunctionalInterface
public  interface UserService {
    void getFirstUser();

     static String sayHello(String name){
       return "Hello " + name;
   }
}
