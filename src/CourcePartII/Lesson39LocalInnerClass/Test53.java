package CourcePartII.Lesson39LocalInnerClass;

public class Test53 {
    public static void main(String[] args) {
        class Addition implements Math3{
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }

        Addition ad = new Addition();
        System.out.println(ad.doOperation(2,3));

    }

}

interface Math3 {
    int doOperation(int a, int b);
}