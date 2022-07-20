package CourcePartII.Lesson67ThreadNameThreadPriority;





public class Test89 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println(myThread.getName()); //Thread-0
        System.out.println(myThread.getPriority());//5 от 1 до 10 Наивысший 10

        myThread.setName("MyThread");
        myThread.setPriority(10);
        System.out.println(myThread.getName()); //MyThread
        System.out.println(myThread.getPriority());//10
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread.setPriority(Thread.NORM_PRIORITY);
        myThread.setPriority(Thread.MIN_PRIORITY);
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}