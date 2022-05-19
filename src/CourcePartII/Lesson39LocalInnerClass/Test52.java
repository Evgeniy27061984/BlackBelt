package CourcePartII.Lesson39LocalInnerClass;

public class Test52 {
    public static void main(String[] args) {
        Math m = new Math();
        m.getResult();
        //Division d = new Division();//не доступно
        Math2 m2 = new Math2();
        m2.getResult(18,2);
    }
}

class Math {
    //Division d = new Division();//не доступно
    public void getResult() {
        int x = 21;//чтобы использовать не должна меняться или final
        //x = 20;
        class Division {//деление
            private int divisible;//делимое
            private int divider;//делитель

            public int getDivisible() {
                return divisible;
            }

            public void setDivisible(int divisible) {
                this.divisible = divisible;
            }

            public int getDivider() {
                return divider;
            }

            public void setDivider(int divider) {
                this.divider = divider;
            }

            public int quotient() {//частное
                return divisible / divider;
            }

            public int remainder() {//частное
                return divisible % divider;
            }

            public int value() {
                return x;
            }
        }
        Division d = new Division();
        d.setDivisible(21);
        d.setDivider(5);
        System.out.println("делимое :" + d.getDivisible());
        System.out.println("делитель :" + d.getDivider());
        System.out.println("частное :" + d.quotient());
        System.out.println("остаток :" + d.remainder());
        System.out.println(d.value());


    }
}

class Math2 {
       public void getResult(int divisible, int divider) { //менять тоже нельзя

        class Division {//деление

            public int getDivisible() {
                return divisible;
            }

            public int getDivider() {
                return divider;
            }

            public int quotient() {//частное
                return divisible / divider;
            }

            public int remainder() {//частное
                return divisible % divider;
            }

        }
        Division d = new Division();

        System.out.println("делимое :" + d.getDivisible());
        System.out.println("делитель :" + d.getDivider());
        System.out.println("частное :" + d.quotient());
        System.out.println("остаток :" + d.remainder());

    }
}