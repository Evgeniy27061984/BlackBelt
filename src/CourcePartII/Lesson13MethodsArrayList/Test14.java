package CourcePartII.Lesson13MethodsArrayList;

import java.util.ArrayList;

public class Test14 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Alex");
        arrayList1.add("Max");
        arrayList1.add(1,"Misha");
        for (String s: arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();
        //ArrayList<int> arrayList2 = new ArrayList<>(); нельзя
        System.out.println(arrayList1.get(3));
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
        //change
        arrayList1.set(1,"Misha2");
        System.out.println(arrayList1);
        //remove
        arrayList1.remove(0);
        System.out.print(arrayList1 + " ");





    }

}
