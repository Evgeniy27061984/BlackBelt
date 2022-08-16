package CourcePartII.Lesson79ScheduledExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test112 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService =
                Executors.newCachedThreadPool();
        //создает потоки по надобности
        //и если задание новых нет то удалит созданный поток



        Thread.sleep(5000);
        executorService.shutdown();

    }


}

class RunnableImp1002 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Begins");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " Ends");
    }
}
