package CourcePartII.Lesson79ScheduledExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test110 {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);

            scheduledExecutorService.schedule(new RunnableImp100(),3, TimeUnit.SECONDS);
            //через 3 сек заработает
            scheduledExecutorService.shutdown();


    }


}
