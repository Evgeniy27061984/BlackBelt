package CourcePartII.Lesson32LinkedHashSet;

import java.util.LinkedHashSet;

public class Test43 {
    public static void main(String[] args) {
       // LinkedHashSet наследник HashSet
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(4);
        lhs.add(2);
        lhs.add(5);
        lhs.add(8);
        lhs.add(1);
        System.out.println(lhs);//[4, 2, 5, 8, 1]
        //Linked соблюдает порядок
        lhs.remove(5);
        System.out.println(lhs);//[4, 2, 8, 1]
        System.out.println(lhs.contains(4));//true

    }
}
