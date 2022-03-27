package CourcePartII.Lesson19CollectionsBinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test27 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
        Collections.sort(arrayList);
        System.out.println(arrayList);//[-30, -8, -3, 0, 1, 5, 8, 10, 12, 19, 150]
        Collections.reverse(arrayList);
        System.out.println(arrayList);//[150, 19, 12, 10, 8, 5, 1, 0, -3, -8, -30]
        Collections.shuffle(arrayList);//перемешивает
        System.out.println(arrayList);

    }
}
