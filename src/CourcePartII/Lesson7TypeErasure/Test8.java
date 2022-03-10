package CourcePartII.Lesson7TypeErasure;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        //JVM see ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(2);
        int a = al1.get(0);
        //JVM see int a = (Integer) al1.get(0);
        // Type erasure - стирание типов


    }

//    public void abc(Info<String> info) { // вместе нельзя так как при компиляции тип затираются
//        String s = info.getValue(); // JVM see abc(Info info) нельзя overload
//    }
//
//    public void abc(Info<Integer> info) { // вместе нельзя так как при компиляции тип затираются
//        Integer i = info.getValue(); //JVM see abc(Info info) overload
//    }
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}

//class Parent() {
//        public void abc(Info<String> info) { //нельзя
//            String s = info.getValue();
//        }
//}
//
//class Child() extends Parent {
//    public void abc(Info<Integer> info) { //нельзя
//        Integer i = info.getValue();
//    }
//}