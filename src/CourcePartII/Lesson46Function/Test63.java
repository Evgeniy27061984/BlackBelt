package CourcePartII.Lesson46Function;


import CourcePartII.Lesson41LambdaPart1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

//фильтрация
public class Test63 {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", 'm', 6, 2, 8.3);
        Student st2 = new Student("Alina", 'w', 3, 1, 6.4);
        Student st3 = new Student("Max", 'm', 13, 3, 8.9);
        Student st4 = new Student("Svetlana", 'w', 34, 3, 7);
        Student st5 = new Student("I", 'm', 38, 2, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Function<Student, Double> f = student -> student.avgGrade;

        double res = avgOfSome (students,stud -> stud.avgGrade);
        System.out.println(res);//7.94
        double res2 = avgOfSome (students,stud -> (double)stud.course);
        System.out.println(res2);//2.2
    }

    private static double avgOfSome(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student st: list ) {
            result += f.apply(st);
        }
        result = result/list.size();
        return result;
    }


}


