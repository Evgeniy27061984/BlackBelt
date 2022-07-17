package CourcePartII.Lesson65and66VariantCreatedThread;

public class Test88 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();


        new Thread(() -> System.out.println("Hello2")).start();

        System.out.println("Hello3");
    }


}
