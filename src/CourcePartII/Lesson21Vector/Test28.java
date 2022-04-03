package CourcePartII.Lesson21Vector;

import java.util.Vector;

public class Test28 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();//class synchronized
        vector.add("Alex");
        vector.add("Maxim");
        vector.add("Alina");
        vector.add("Svetlana");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
