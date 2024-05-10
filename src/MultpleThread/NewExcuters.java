package MultpleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewExcuters {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i <10 ; i++) {
            Runnable task=new MyTask(i);
            executor.execute(task);
        }
        executor.shutdown();
    }

    static class MyTask implements Runnable {
        private int taskId;
        public MyTask(int taskId) {
            this.taskId=taskId;
        }

        @Override
        public void run() {
            System.out.println("Task " + taskId + " is executing by " + Thread.currentThread().getName());
            // 模拟任务执行时间
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task " + taskId + " is completed.");
        }
    }
}
