package CourcePartII.Lesson79ScheduledExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test111 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);

        scheduledExecutorService.scheduleAtFixedRate(new RunnableImp1001(),
                3, 1, TimeUnit.SECONDS);
        //1 - 3 сек
        // далее по 1 сек (промежуток времени между началом первого задание и началом 2 задания)
        Thread.sleep(5000);
        scheduledExecutorService.shutdown();

    }


}

class RunnableImp1001 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Begins");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(Thread.currentThread().getName() + " Ends");
    }
}