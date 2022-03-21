package CourcePartII.Lesson15MethodsArraysList3Part;

import java.util.ArrayList;

public class Test18 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Alex");
        arrayList1.add("Max");
        arrayList1.add("Alina");
        System.out.println(arrayList1);//[Ivan, Alex, Max, Alina]

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Alex");
        arrayList2.add("Max");

        arrayList1.removeAll(arrayList2);
        System.out.println(arrayList1);//[Alina] где нет совпадений
        arrayList2.add("Max");
        arrayList2.add("Alina");
        arrayList2.retainAll(arrayList1);
        System.out.println(arrayList2);//[Alina] есть и в том и другом массиве
        arrayList2.add("Ivan");
        arrayList2.add("Alex");
        arrayList2.add("Max");
        System.out.println(arrayList2);//[Alina, Ivan, Alex, Max]

        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Ivan");
        arrayList3.add("Alex");
        //arrayList3.add("Max");
        boolean b = arrayList2.containsAll(arrayList3);
        System.out.println(b);//true если в arrayList2 есть все arrayList3


    }
}
