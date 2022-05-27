package CourcePartII.Lesson42LambdaPart2;

import CourcePartII.Lesson41LambdaPart1.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test58 {
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
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.course - s2.course;
            }
        });
        System.out.println(students);
        Collections.sort(students,(stud1,stud2) -> stud1.age - stud2.age);
        System.out.println(students);


        StudentInfo info = new StudentInfo();
        info.testStudents(students,(Student s) -> { return s.avgGrade == 8.3;});
        info.testStudents(students, s -> s.avgGrade == 8.3);//супер краткая lambda
        info.testStudents(students, s -> { return s.avgGrade == 8.3;});//смешанная запись
        //info.testStudents(students, (s,x) -> s.avgGrade == 8.3);//если два параметра в интерфейсе
        info.testStudents(students, s -> { System.out.println("Привет");  return s.avgGrade == 8.3;});
        //нужно полный вариант два параметра справа
        StudentChecks ch = (Student p) -> { return p.avgGrade == 8.3;};
        info.testStudents(students,ch);

    }
}

class StudentInfo {
    void testStudents( ArrayList<Student> a1, StudentChecks sc) {
        for (Student s: a1) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

interface StudentChecks { //функциональный интерфейс
    boolean check(Student s);
    //boolean check(Student s, int x);// два параметра
}



