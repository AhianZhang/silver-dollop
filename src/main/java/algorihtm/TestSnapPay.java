package algorihtm;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.lang.annotation.Target;

/**
 * 在磁盘上有一个目录（非根目录），目录下有很多文件和子目录。请写一个程序以两种不同的方式遍历这个目录。
 * 方法A：请按顺序执行以下规则
 * (1)打印出目录下所有文件和子目录（格式依照”display rule”）。每行一条。
 * (2)如果前面输出的内容里有目录，每个目录按照规则1执行一遍，然后再执行一遍规则2。
 * 方法B
 * (3)对于目录下的所有内容，如果是普通文件，按”display rule”打印出来，如果是目录，按规则3再执行一遍。
 *
 * 假定起始目录的名字是”root”，任何在此目录下的子孙文件或目录应显示为“root->parent1->parent2->…->name”。
 * 备注：不需要打印出”root”的父目录。
 *
 * @author ahianzhang
 * @version 1.0
 * @date 2021/10/11 9:54 PM
 **/
public class TestSnapPay {

    /**
     * files and directories
     * @param dir directory
     */
    public void traverseA(File dir) {
        if (!dir.isDirectory()){
            System.err.println(dir + " is not exist");
            return;
        }
        File[] files = dir.listFiles();
        for (File file : files){
            System.out.println(filePathFormatter(file));
            if (file.isDirectory()){
                traverseA(file);
            }
        }

    }

    /**
     *  files only?
     * @param dir directory
     */
    public void traverseB(File dir) {
        if (!dir.isDirectory()){
            System.err.println(dir + " is no exist");
            return;
        }
        File[] files = dir.listFiles();
        for (File file:files){
            if (file.isFile()){
                System.out.println(filePathFormatter(file));
            }else {
                traverseB(file);
            }
        }
    }

    private String filePathFormatter(File dir){
        return dir.toString().replaceAll("/","->");
    }
}
