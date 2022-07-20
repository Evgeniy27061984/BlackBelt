package CourcePartII.Lesson67ThreadNameThreadPriority;

public class Test90 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());//показывает текущий поток
    }


    public static void main(String[] args) {
        Thread thread = new Thread(new Test90());
        thread.start();
        System.out.println(Thread.currentThread().getName());
//        main
//        Thread-0
        thread.run();//не запускает Test90
//        main
//        main
//        Thread-0

   }


}
