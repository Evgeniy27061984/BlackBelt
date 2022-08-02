package CourcePartII.Lesson72SynchronizedBlock;

import static CourcePartII.Lesson72SynchronizedBlock.Test100.increment;

public class Test100 {
    volatile static int counter = 0;
    public static void increment() {
        synchronized(Test100.class) {
            counter++;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());
        thread1.start();
        thread2.start();
        thread1.join();//ждем thread1 пока не закончит
        thread2.join();//ждем thread2 пока не закончит
// в конце main
        System.out.println(counter);
    }
}

class R2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000000000; i++) {
            increment();
        }
    }
}

