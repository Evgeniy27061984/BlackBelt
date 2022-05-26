package CourcePartII.Lesson41LyamdaPart1;

public class Test57 {
    static  void def (I i) {
        System.out.println(i.abc("Привет"));
    }

    public static void main(String[] args) {
        def((String str) -> {return str.length();});
    }

}

interface I {
    int abc (String s);
}
