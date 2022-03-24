package CourcePartII.Lesson16Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test22 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Alex");
        arrayList1.add("Max");
        arrayList1.add("Alina");
        arrayList1.add("Alina2");
        Iterator<String> iterator = arrayList1.iterator(); // это повторитель
        while (iterator.hasNext()) { // отличие можно удалить элементы
            System.out.println(iterator.next());
            System.out.println(iterator.hasNext());//true end false
        }
        Iterator<String> iterator2 = arrayList1.iterator(); // это повторитель
        while (iterator2.hasNext()) { // отличие можно удалить элементы
            iterator2.next();
            iterator2.remove();
        }
        System.out.println(arrayList1);//[]

    }
}
