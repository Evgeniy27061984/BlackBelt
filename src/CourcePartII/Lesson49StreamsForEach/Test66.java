package CourcePartII.Lesson49StreamsForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test66 {
    //return void
    public static void main(String[] args) {
        int [] array = {5,9,3,8,1};
        Arrays.stream(array).forEach(el-> {el*=2;
            System.out.println(el);});

        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(Util::MyMethod);
        Student st1 = new Student("Alex", 'm', 6, 2, 8.3);
        Student st2 = new Student("Alina", 'w', 3, 1, 6.4);
        Student st3 = new Student("Max", 'm', 13, 3, 8.9);
        Student st4 = new Student("Svetlana", 'w', 34, 3, 7);
        Student st5 = new Student("I", 'm', 38, 2, 9.1);
        Stream<Student> myStream = Stream.of(st1,st2,st3,st4,st5);
        List<Student> list = new ArrayList<>();
        list = myStream.filter(el
                ->el.getAge() >22 && el.getAvgGrade()>7)
                .collect(Collectors.toList());
        System.out.println(list);

}
    }
class Util {
    public static void MyMethod(int a) {
        a = a +5;
        System.out.println(a);
    }
}