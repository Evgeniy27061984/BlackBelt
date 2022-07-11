package CourcePartII.Lesson51Sorted;

import CourcePartII.Lesson48StreamsFilter.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test68 {
    public static void main(String[] args) {
        int [] array = {5,9,25,5,98};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
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

        students = students.stream().sorted((x,y) ->
                x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println(students);
        //Student{name='Alex', sex=m, age=6, course=2, avgGrade=8.3},
        // Student{name='Alina', sex=w, age=3, course=1, avgGrade=6.4},
        // Student{name='I', sex=m, age=38, course=2, avgGrade=9.1},
        // Student{name='Max', sex=m, age=13, course=3, avgGrade=8.9},
        // Student{name='Svetlana', sex=w, age=34, course=3, avgGrade=7.0}]
    }
}
