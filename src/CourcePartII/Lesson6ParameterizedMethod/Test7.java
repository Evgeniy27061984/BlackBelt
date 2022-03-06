package CourcePartII.Lesson6ParameterizedMethod;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(2);
        al1.add(3);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Hello");
        al2.add("Bye");
        String s = GenMethod.getSecondElement(al2);
        System.out.println(s);


    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) { //<T> T это чтоб работало параметризация ArrayList
        return al.get(1);
    }
}
