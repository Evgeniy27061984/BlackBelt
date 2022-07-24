package CourcePartII.Lesson68SleepJoin;

public class Test92 extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        Test92 thread2 = new Test92();
        thread1.start();
        thread2.start();
        thread1.join();//ждем thread1 пока не закончит
        thread2.join();//ждем thread2 пока не закончит
// в конце main
        System.out.println("Finish");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
