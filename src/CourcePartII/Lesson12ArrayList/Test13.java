package CourcePartII.Lesson12ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test13 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan");
        arrayList2.add("Alex");
        arrayList2.add("Max");
        System.out.println(arrayList2);
        ArrayList<String> arrayList3 = new ArrayList<>(30);
        //чтобы не увеличивать тк занимает много памяти
        // если > 10 элементов то создает новый массив, копирует из старого итд
        List<String> arrayList4 = new ArrayList<>(30);
        // ArrayList implements list поэтому такое возможно
        List<String> arrayList5 = new ArrayList<>(arrayList1);
        System.out.println(arrayList1 == arrayList5);   //false тк не ссылаются на один объект
        ArrayList arrayList6= new ArrayList();  // можно добавить любой тип


    }
}
