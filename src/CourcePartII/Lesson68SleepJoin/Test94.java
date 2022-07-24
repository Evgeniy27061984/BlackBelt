package CourcePartII.Lesson68SleepJoin;

public class Test94 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main start");
        Thread thread1 = new Thread(new MyRunnable3());
        System.out.println(thread1.getState());//NEW
        thread1.start();
        System.out.println(thread1.getState());//RUNNABLE
        thread1.join();
        System.out.println(thread1.getState());//TERMINATED
        System.out.println("Main end");
    }
}

class MyRunnable3 implements Runnable {

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