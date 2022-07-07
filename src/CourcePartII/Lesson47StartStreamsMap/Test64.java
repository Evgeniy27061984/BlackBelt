package CourcePartII.Lesson47StartStreamsMap;


import java.util.*;
import java.util.stream.Collectors;

public class Test64 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("How are you");
        list.add("Ok");
        list.add("Bye");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//        System.out.println(list);//[5, 11, 2, 3]

        List<Integer> list2 = list.stream().map(element -> element.length())
                .collect(Collectors.toList());
        System.out.println(list2);//[5, 11, 2, 3]

        int[] array = {5, 9, 3, 8, 11};
        array = Arrays.stream(array).map(
                el -> {
                    if(el%3 == 0) {
                    el = el/3;
                    }
                return el;
        }).toArray();
        System.out.println(Arrays.toString(array));


        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("How are you");
        set.add("Ok");
        set.add("Bye");
        System.out.println(set);//[Bye, Hello, How are you, Ok]

        Set<Integer> set2 =set.stream().map(e-> e.length()).collect(Collectors.toSet());
        System.out.println(set2);//[2, 3, 5, 11]
        List<Integer> list3 =set.stream().map(e-> e.length()).collect(Collectors.toList());
        System.out.println(list3);//[3, 5, 11, 2]
    }


}
