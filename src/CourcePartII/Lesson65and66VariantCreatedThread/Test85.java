package CourcePartII.Lesson65and66VariantCreatedThread;

public class Test85 {
    public static void main(String[] args) {

        Thread myThread3 = new Thread(new MyThread3());
        Thread myThread4 = new Thread(new MyThread3());

        myThread3.start();
        myThread4.start();


    }
}

class MyThread3 implements Runnable{
   public void run(){
       for (int i = 0; i <1000; i++) {
           System.out.println(i);
       }
   }
}

class MyThread4 implements Runnable{
    public void run(){
        for (int i = 1000; i >0; i--) {
            System.out.println(i);
        }
    }
}
