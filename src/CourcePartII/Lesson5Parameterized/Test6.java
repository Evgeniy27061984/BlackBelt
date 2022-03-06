package CourcePartII.Lesson5Parameterized;

public class Test6 {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello");
        System.out.println(info1);
        Info<Integer> info2 = new Info<>(5);
        System.out.println(info2);
        String s = info1.getValue();
        System.out.println(s);

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
