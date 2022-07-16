package CourcePartII.Lesson61Limit;

import CourcePartII.Lesson48StreamsFilter.Student;

import java.util.ArrayList;
import java.util.List;

public class Test80 {
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

       students.stream().filter(e -> e.getAge() >20).limit(1).forEach(System.out::println);
        //Student{name='Svetlana', sex=w, age=34, course=3, avgGrade=7.0}




    }
}

