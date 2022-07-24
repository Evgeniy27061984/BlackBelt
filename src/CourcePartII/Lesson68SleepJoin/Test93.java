package CourcePartII.Lesson68SleepJoin;

public class Test93 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main start");
        Thread thread1 = new Thread(new MyRunnable2());
        thread1.start();
        thread1.join(1500); //пока не закочится поток thread или не пройдет 1.5 сек
        System.out.println("Main end");
    }
}

class MyRunnable2 implements Runnable {

    @Override
    public void run() {

        System.out.println("Works start");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Works ends");

    }
}