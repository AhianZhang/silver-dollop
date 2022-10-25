import algorihtm.leetcode.TreeNode;

import java.util.*;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/3/1 4:50 PM
 **/
public class Demo6 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();

        Person p = new Person("ahian");
        p.print();
        Worker worker = new Worker("ahian","lawyer");
        worker.print();

    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("my name is " + name);
    }


}

class Worker extends Person {
    private final String job;

    public Worker(String name, String job) {
        super(name);
        this.job = job;
    }

    @Override
    public void print() {
        System.out.println("my job is " + job);
    }
}

