package CourcePartII.Lesson15MethodsArraysList3Part;

import java.util.ArrayList;
import java.util.List;

public class Test19 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Alex");
        arrayList1.add("Max");
        arrayList1.add("Alina");
        arrayList1.add("Alina2");
        System.out.println(arrayList1);//[Ivan, Alex, Max, Alina, Alina2]
        List<String> arrayList2 = arrayList1.subList(1,4);
        System.out.println(arrayList2);//[Alex, Max, Alina] это view представление
        arrayList2.add("Max2");
        System.out.println(arrayList1);//[Ivan, Alex, Max, Alina, Max2, Alina2]
        System.out.println(arrayList2);//[Alex, Max, Alina, Max2]


        //так нельзя
//        arrayList1.add("Max3");
//        System.out.println(arrayList1);
//        //System.out.println(arrayList2);//Exception in thread "main
        //изменять можно только через arrayList2

    }
}
