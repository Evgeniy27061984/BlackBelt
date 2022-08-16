package CourcePartII.Lesson77BreakThread;

public class Test107 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start");
        InterruptedThread thread = new InterruptedThread();
        thread.start();

        Thread.sleep(2000);
        //interruptedThread.stop();// не используется
        thread.interrupt();
        thread.join();
        System.out.println("Main thread ends");
    }

}

class InterruptedThread extends Thread {
    double sqrtSum = 0;
    @Override
    public void run() {
        for (int i = 1; i < 1000000000; i++) {
            if(isInterrupted()) {
                System.out.println("thread want stop");
                System.out.println("if all ok, stop");
                System.out.println(sqrtSum);
                return;
            }
                sqrtSum += Math.sqrt(i);
            try {
                sleep(1); // это делается чтоб при прерывании мы узнали что нас хотят прервать  во время сна
                //если не делать мы это узнаем только после сна
            } catch (InterruptedException e) {
                System.out.println("thread want stop in sleep");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}