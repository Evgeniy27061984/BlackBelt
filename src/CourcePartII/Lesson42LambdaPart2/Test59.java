package CourcePartII.Lesson42LambdaPart2;

public class Test59 {
    static  void def (I i) {
        System.out.println(i.abc());
    }

    public static void main(String[] args) {
        int i =10;
        //i = 30; //менять нельзя если
        def(() -> {return 18 + i;});
        def(() ->  18);
    }

}

interface I {
    int abc ();
}
