package CourcePartII.Lesson63MapToInt;

import CourcePartII.Lesson48StreamsFilter.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test82 {
    public static void main(String[] args) {

        Student st1 = new Student("Alex", 'm', 6, 2, 8.3);
        Student st2 = new Student("Alina", 'w', 3, 1, 6.4);
        Student st3 = new Student("Max", 'm', 13, 3, 8.9);
        Student st4 = new Student("Svetlana", 'w', 34, 3, 7);
        Student st5 = new Student("I", 'm', 38, 2, 9.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

       List <Integer> list = students.stream()
               .mapToInt(e -> e.getCourse())
               .boxed()                         //конвертирует в Integer в Double во все необходимые
               .collect(Collectors.toList());

        System.out.println(list); //[2, 1, 3, 3, 2]

        List <Double> list2 = students.stream()
                .mapToDouble(e -> e.getAvgGrade())
                .boxed()                         //конвертирует в Integer в Double во все необходимые
                .collect(Collectors.toList());

        System.out.println(list2); //[8.3, 6.4, 8.9, 7.0, 9.1]

       int sum = students.stream().mapToInt(e -> e.getCourse()).sum();
        System.out.println(sum);//11

        double average = students.stream().mapToInt(e -> e.getCourse()).average().getAsDouble();
        System.out.println(average);//2.2

       int min = students.stream().mapToInt(e -> e.getCourse()).min().getAsInt();
        System.out.println(min);//1
    }
}

