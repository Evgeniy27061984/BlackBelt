package CourcePartII.Lesson71SynchronizedMethods;

public class Test98 {
    static int counter = 0;
    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter); //должно быть 200000
        //ну так как не синхр. не всегда будет 200000
    }
}

class R implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            Test98.increment();
        }

    }
}

