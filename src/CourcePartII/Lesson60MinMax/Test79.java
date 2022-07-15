package CourcePartII.Lesson60MinMax;

import CourcePartII.Lesson48StreamsFilter.Student;

import java.util.ArrayList;
import java.util.List;

public class Test79 {
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

        Student stMin = students.stream().min((x,y) -> x.getAge() - y.getAge()).get();

        System.out.println(stMin);
        //Student{name='Alina', sex=w, age=3, course=1, avgGrade=6.4}

        Student stMax = students.stream().max((x,y) -> x.getAge() - y.getAge()).get();

        System.out.println(stMax);
//        Student{name='I', sex=m, age=38, course=2, avgGrade=9.1}
    }
}

