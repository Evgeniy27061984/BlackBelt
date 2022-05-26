package CourcePartII.Lesson40Anonymous;

public class Test54 {
    private int s = 5;//можно обратиться но надо создать класс Test54
    public static void main(String[] args) {
        // использовать когда необходимо один раз
        //конструктор нельзя тк имени нет класса
        Math3 m = new Math3() {
            int x = 8;
            void abc() {

            }
            Test54 t = new Test54();

            @Override
            public int doOperation(int a, int b) {
                return a+b+t.s;
            }
        };
        Math3 m2 = new Math3() {

            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };

        System.out.println(m.doOperation(2,3));
        System.out.println(m2.doOperation(2,3));

        Math4 m3 = new Math4() {

            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };

        System.out.println(m3.doOperation(2,3));
    }
}

interface Math3 {
    int doOperation(int a, int b);
}
class Math4 {
    int doOperation(int a, int b) {
        return a-b;
    }
}