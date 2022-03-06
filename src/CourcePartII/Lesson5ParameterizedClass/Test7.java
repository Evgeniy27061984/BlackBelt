package CourcePartII.Lesson5ParameterizedClass;

public class Test7 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello",100);
        System.out.println(pair.getFirstValue());
        System.out.println(pair.getSecondValue());
        OtherPair<Integer> otherPair = new OtherPair<>(50,100);
        System.out.println(otherPair.getFirstValue());
        System.out.println(otherPair.getSecondValue());
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }

}

class OtherPair<V> {
    private V value1;
    private V value2;

    public V getValue1() { // здесь не надо <V> так как оно есть в названии класса
        return  value1;
    }

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }

}