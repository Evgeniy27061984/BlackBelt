package CourcePartII.Lesson31TreeSet;


import java.util.Set;
import java.util.TreeSet;

public class Test41 {
    public static void main(String[] args) {
        Set<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(5);
        treeSet1.add(2);
        treeSet1.add(3);
        treeSet1.add(1);
        treeSet1.add(8);
        System.out.println(treeSet1);//[1, 2, 3, 5, 8]
        //treeSet1.add(null);//нельзя
        treeSet1.remove(2);
        System.out.println(treeSet1);//[1, 3, 5, 8]
        System.out.println(treeSet1.contains(1));//true
    }
}
