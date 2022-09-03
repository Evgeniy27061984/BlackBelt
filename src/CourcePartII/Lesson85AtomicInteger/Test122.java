package CourcePartII.Lesson85AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Test122 {
   //static int count;
    static AtomicInteger count =new AtomicInteger();

    public static void increment() {
        //count++;
        //count.incrementAndGet();
        //count.addAndGet(5);//++5
        count.addAndGet(-5);//--5
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(count);
    }

}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Test122.increment();

        }
    }
}
