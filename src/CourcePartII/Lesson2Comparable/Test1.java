package CourcePartII.Lesson2Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Ivan");
        list.add("A");
        System.out.println("don't sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("sort");
        System.out.println(list);
    }
}
