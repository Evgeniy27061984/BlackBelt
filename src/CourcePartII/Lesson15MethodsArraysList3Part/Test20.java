package CourcePartII.Lesson15MethodsArraysList3Part;

import java.util.ArrayList;

public class Test20 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Alex");
        arrayList1.add("Max");
        arrayList1.add("Alina");
        arrayList1.add("Alina2");
        System.out.println(arrayList1);//[Ivan, Alex, Max, Alina, Alina2]
        Object[] array = arrayList1.toArray();
        System.out.println(array.toString());//[Ljava.lang.Object;@378bf509
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");//[Ivan, Alex, Max, Alina, Alina2]
        }
        System.out.println();
        String[] array2 = arrayList1.toArray(new String[0]);
        System.out.println(array2.toString());//[Ljava.lang.Object;@378bf509
        for (String s: array2) {
            System.out.print(s + " ");
        }



    }
}
