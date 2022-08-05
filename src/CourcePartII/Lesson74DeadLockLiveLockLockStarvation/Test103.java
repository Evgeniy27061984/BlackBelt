package CourcePartII.Lesson74DeadLockLiveLockLockStarvation;

public class Test103 {
//            DeadLock = 2 потока ожидают друг друга и ничего не делают
//            LiveLock = 2 потока ожидают друг друга и делают работу без прогресса
//            LockStarvation = менее приоритетные потоки ожидают
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {
//порядок lock1 lock2 одинаковы
        MyThread2 myThread2 = new MyThread2();
        MyThread myThread = new MyThread();
        myThread2.start();
        myThread.start();

    }

}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread Попытка захвата monitor LOCK1");
        synchronized (Test103.lock1) {
            System.out.println("MyThread Захвачен LOCK1");
            System.out.println("MyThread Попытка захвата monitor LOCK2");
            synchronized (Test103.lock2) {
                System.out.println("MyThread  захвачен LOCK2");
            }
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 Попытка захвата monitor LOCK1");
        synchronized (Test103.lock2) {
            System.out.println("MyThread2 Захвачен LOCK2");
            System.out.println("MyThread2 Попытка захвата monitor LOCK1");
            synchronized (Test103.lock1) {
                System.out.println("MyThread2  захвачен LOCK1");
            }
        }
    }
}