package pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-09-10 18:58
 **/
public class LoD {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.command(new GroupLeader(new ArrayList<>()));
    }
}

class Teacher{

    void command(GroupLeader leader){

        leader.countLeader();
    }


}
 class GroupLeader {

    private List<Girls> girls ;

     public GroupLeader(List<Girls> girls) {
         this.girls = girls;
     }

     void countLeader(){
        System.out.println("女生数量是："+ this.girls.size());
    }
}

 class Girls {
}

class Wizard{
    private Random random = new Random(System.currentTimeMillis());

    private int firstStep(){
        System.out.println("执行第一步");
        return random.nextInt(100);
    }

    private int secondStep(){
        System.out.println("执行第二步");
        return random.nextInt(100);
    }

    private int thirdStep(){
        System.out.println("执行第三步");
        return random.nextInt(100);
    }
    public void installWizard(){

        int first =  this.firstStep();

        if (first > 50){
            int second = this.secondStep();
            if (second > 50){
                int third = this.thirdStep();
                if (third > 50){
                    this.firstStep();
                }
            }
        }

    }
}


class InstallSoftware{
    public  void  install(Wizard wizard){
        wizard.installWizard();
    }
}
