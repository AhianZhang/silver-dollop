package java8;

import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/8/30 17:17
 **/
public class CompleteFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        CompletableFuture<Person> cf1 = CompletableFuture.supplyAsync(() -> {
            Person person = new Person();
            System.out.println("cf1");
            System.out.println(Thread.currentThread().getName());
            person.setName("ahian");
            return person;
        }, executor);
        CompletableFuture<Person> cf2 = CompletableFuture.supplyAsync(() -> {
            Person person = new Person();
            person.setAge("123");
            System.out.println("cf2");
            System.out.println(Thread.currentThread().getName());

            return person;
        },executor);
        cf1.thenCombine(cf2, (result1, result2) -> {
            String age = result1.getAge();
            String name = result1.getName();
            String age1 = result2.getAge();
            String name1 = result2.getName();
            System.out.println("cf3");
            System.out.println(Thread.currentThread().getName());

            System.out.printf("age:%s, name:%s, age1:%s, name1: %s",age,name,age1,name1);
            Person person = new Person();
            person.setName(name);
            person.setAge(age1);
            return person;
        }).thenAccept(System.out::println);

        CompletableFuture<Void> end = CompletableFuture.allOf(cf1, cf2);
        CompletableFuture<Person> personCompletableFuture = end.thenApply(v -> {
            Person name = cf1.join();
            Person age = cf2.join();
            System.out.println(Thread.currentThread().getName());
            name.setAge(age.getAge());
            return name;
        });
        try {
            Person person = personCompletableFuture.get(1000, TimeUnit.MILLISECONDS);
            System.out.println(person);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
    }
}
class Person{
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
