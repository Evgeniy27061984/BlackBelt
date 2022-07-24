package CourcePartII.Lesson68SleepJoin;

public class Test91 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Поехали");
    }
}
