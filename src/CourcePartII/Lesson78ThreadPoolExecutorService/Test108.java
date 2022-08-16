package CourcePartII.Lesson78ThreadPoolExecutorService;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Test108 {
    public static void main(String[] args) throws InterruptedException {
        //ExecutorService executorService = Executors.newFixedThreadPool(3);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImp100()); //type Runnable
        }
        executorService.shutdown();
        executorService.awaitTermination(5, TimeUnit.SECONDS);//main join что раньше 5 сек или потоки
        System.out.println("Main ends");
    }
}

class RunnableImp100 implements Runnable {

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

