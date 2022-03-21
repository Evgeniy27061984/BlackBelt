package CourcePartII.Lesson15MethodsArraysList3Part;


import java.util.Arrays;
import java.util.List;

public class Test17 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder [] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array); //get List from array Связан с массивом array
        System.out.println(list);
        array[0].append("!!!");
        System.out.println(list);
        array[0] = new StringBuilder("F");
        System.out.println(list);
    }
}
