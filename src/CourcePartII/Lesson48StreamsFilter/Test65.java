package CourcePartII.Lesson48StreamsFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test65 {
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

        students = students.stream().filter(el
                ->el.getAge() >22 && el.getAvgGrade()>7)
                .collect(Collectors.toList());
        System.out.println(students);//[Student{name='I', sex=m, age=38, course=2, avgGrade=9.1}]

    }
}
