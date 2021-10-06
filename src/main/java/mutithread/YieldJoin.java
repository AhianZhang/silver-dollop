package mutithread;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 5/6/21 4:37 PM
 **/
public class YieldJoin {

    public static void main(String[] args) {
//        Runnable target = null;
//        Thread thread = new Thread(target);
//        Persons persons = new Persons();
//        persons.setName("abc");

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder insert = stringBuilder.insert(0, "123");
        System.out.println(insert.toString());
//        insert.delete()


    }


}
class Persons {
    private String name;

    public void setName(String name) {
        this.name = name;
        if (Thread.currentThread().getName().equals("A")) {
            System.out.println("停止 A 线程");
            Thread.yield();
        }
    }

    public String getName() {
        return name;
    }
}