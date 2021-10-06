package mutithread;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 5/6/21 4:09 PM
 **/
public class SuspendResume {
    public static void main(String[] args) {

        final  Person person = new Person();
        Thread threadA = new Thread("A"){
            @Override
            public void run() {
               person.setName("ahianzhang");
            }
        };
        threadA.start();
        Thread threadB = new Thread("B"){
            @Override
            public void run() {
                System.out.println(person.getName());
            }
        };

        threadB.start();

    }
}

class Person{
    private String name;
    public void setName(String name){
        this.name = name;
        if (Thread.currentThread().getName().equals("A")){
            System.out.println("停止 A 线程");
            Thread.currentThread().suspend();
        }
    }

    public String getName() {
        return name;
    }
}
