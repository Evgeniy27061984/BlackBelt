package CourcePartII.Lesson4Generic;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>(); // <> need always
        //    List list = new ArrayList();//
//        list.add("OK");
//        list.add(5);
//        list.add(new String());
//        list.add(new Car()); //in arraylist don't without <>
        list.add("Hello");
        list.add("bye");
        list.add("Ok");
        list.add("boy");

//        for (Object o : list) {
//            System.out.println(o + " length " + ((String) o).length());
//        }

        for (String s : list) {
            System.out.println(s + " length " + s.length());
        }
        
    }
}

class Car {

}