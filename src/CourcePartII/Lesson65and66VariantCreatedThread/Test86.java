package CourcePartII.Lesson65and66VariantCreatedThread;

public class Test86 extends Thread{
    public void run(){
        for (int i = 0; i <1000; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Test86 t = new Test86();
        t.start();
        for (int i = 10000; i >0; i--) {
            System.out.println(i);
        }
    }
}

