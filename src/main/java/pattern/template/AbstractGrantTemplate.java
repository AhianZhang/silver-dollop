package pattern.template;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2020/10/19 5:07 PM
 **/
public abstract class AbstractGrantTemplate {
   abstract void grant();
   public void issueToken(){
       System.out.println("签发成功");
   }
}
