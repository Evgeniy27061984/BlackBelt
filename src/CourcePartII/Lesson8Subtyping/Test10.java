package CourcePartII.Lesson8Subtyping;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        Bus s2 = new Bus();
        Info<Bus> info1 = new Info<>(s2);
        System.out.println(info1);
        Bus s = info1.getValue();
        System.out.println(s);
        System.out.println(s.equals(s2));


    }
}

class Info<T> { // T for type, E for elements in arraylist, K for map keys, V for map values
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

class Bus {

}

class Info2<T extends Number&I1&I2> { // только число Integer or Double or  итп implements I1,I2
    private T value;

    public Info2(T value) {
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

class GenMethod {
    public static <T extends Number> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
//    public static <T> T getSecondElement(ArrayList<T extends Number> al) { так нельзя
//        return al.get(1);
//    }
}
interface I1 {

}
interface I2 {

}
