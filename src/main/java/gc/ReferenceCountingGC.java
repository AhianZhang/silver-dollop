package gc;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-10-21 11:30
 **/
public class ReferenceCountingGC {


    private Object instance;
    public ReferenceCountingGC(String name){

    }

    public static void testGc(){

        ReferenceCountingGC rc1 = new ReferenceCountingGC("Obj1");
        ReferenceCountingGC rc2 = new ReferenceCountingGC("Obj2");
        rc1.instance = rc2;
        rc2.instance = rc1;

        rc1 = null;
        rc2 = null;
    }


    public static void main(String[] args) {
        ReferenceCountingGC.testGc();
    }
}
