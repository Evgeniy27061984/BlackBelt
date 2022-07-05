package CourcePartII.Lesson43Predicate;

import CourcePartII.Lesson41LambdaPart1.Student;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("one");
        a1.add("two");
        a1.add("three");
        a1.add("four");
        a1.add("five");
        a1.removeIf(element -> element.length() < 5);
        System.out.println(a1);
        //[three]
        // OR
        Predicate<String> p = element -> element.length() < 5;
        a1.removeIf(p);
        System.out.println(a1);
        //[three]
    }
}
