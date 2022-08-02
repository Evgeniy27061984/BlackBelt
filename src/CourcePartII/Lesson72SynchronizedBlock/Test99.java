package CourcePartII.Lesson72SynchronizedBlock;

public class Test99 {
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
    private void increment2 () { // private так как вызывается только MyRunnable
        System.out.println("Ура");
    }


    private void increment () { // private так как вызывается только MyRunnable
        increment2 ();
        synchronized (this) { //указывается явно какой монитор объекта использовать
            //а в методах по умолчанию this

            Counter.count++;
            System.out.println(Counter.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
