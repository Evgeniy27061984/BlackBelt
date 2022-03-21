package CourcePartII.Lesson15MethodsArraysList3Part;

import java.util.ArrayList;
import java.util.List;

public class Test21 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Alex");
        arrayList1.add("Max");
        arrayList1.add("Alina");
        arrayList1.add("Alina2");
        System.out.println(arrayList1);
        List<Integer> list1 = List.of(3,8,12);
        System.out.println(list1);
        //list1.add(100); // нельзя Exception in thread "main" java.lang.UnsupportedOperationException
        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);
    }
}
