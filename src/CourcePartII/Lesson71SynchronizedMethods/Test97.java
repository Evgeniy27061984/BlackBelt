package CourcePartII.Lesson71SynchronizedMethods;

//без синхронизации нельзя
//так как происходит гонка данных
//и один поток может шустрее прочитать и записать данные
public class Test97 extends Thread{
    public static void main(String[] args) throws InterruptedException {
       MyRunnable runnable = new MyRunnable();
       Thread thread1 = new Thread(runnable);
       Thread thread2 = new Thread(runnable);
       Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRunnable implements Runnable {
    public void increment () {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
