package CourcePartII.Lesson30HashSet;

import java.util.HashSet;
import java.util.Set;

public class Test39 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Alex");
        set.add("Alina");
        set.add("Max");
        set.add("Svetlana");
        set.add("Svetlana");//дубликат нельзя
        set.add(null);//можно
        System.out.println(set);//[null, Alex, Max, Svetlana, Alina]
        set.remove(null);
        System.out.println(set);//[Alex, Max, Svetlana, Alina]
        for (String s: set) {
            System.out.println(s);
        }
        System.out.println(set.size());//4
        System.out.println(set.isEmpty());//false
        System.out.println(set.contains("Alina"));//true
        //System.out.println(set.get());//нет метода
    }
}
