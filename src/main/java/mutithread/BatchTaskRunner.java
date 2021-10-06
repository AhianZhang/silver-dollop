package mutithread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.function.Consumer;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 3/17/21 10:53 AM
 **/
public final class BatchTaskRunner extends RecursiveAction {

    protected int threshold = 5; //每個執行緒處理的任務數
    protected List taskList;
    Consumer<List> action;

    /**
     * @param taskList      任務列表
     * @param threshold     每個執行緒處理的任務數
     */
    private BatchTaskRunner(List taskList, int threshold, Consumer action) {
        this.taskList = taskList;
        this.threshold = threshold;
        this.action = action;
    }

    /**
     * 多執行緒批量執行任務
     * @param taskList
     * @param threshold
     * @param action
     */
    public static <T> void execute(List<T> taskList, int threshold, Consumer<List<T>> action) {
        new BatchTaskRunner(taskList, threshold, action).invoke();
    }

    @Override
    protected void compute() {
        if (taskList.size() <= threshold) {
            this.action.accept(taskList);
        }
        else {
            this.splitFromMiddle(taskList);
        }
    }

    /**
     * 任務中分
     * @param list
     */
    private void splitFromMiddle(List list) {
        int middle = (int)Math.ceil(list.size() / 2.0);
        List leftList = list.subList(0, middle);
        List RightList = list.subList(middle, list.size());
        BatchTaskRunner left = newInstance(leftList);
        BatchTaskRunner right = newInstance(RightList);
        ForkJoinTask.invokeAll(left, right);
    }

    private BatchTaskRunner newInstance(List taskList) {
        return new BatchTaskRunner(taskList, threshold, action);
    }


    public static void main(String[] args) {
        List<Integer> allTasks = Arrays.asList(1,2,3,4,5);
        int taskPerThread = 1;
        BatchTaskRunner.execute(allTasks, taskPerThread, tasks -> {
            System.out.printf("[%s]: %s\n", Thread.currentThread().getName(), tasks);
        });
    }

}
