package CourcePartII.Lesson65and66VariantCreatedThread;

public class Test87 implements Runnable{
    public void run(){
        for (int i = 0; i <1000; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        Thread myThread5 = new Thread(new Test87());
        myThread5.start();
        for (int i = 10000; i >0; i--) {
            System.out.println(i);
        }
    }
}

