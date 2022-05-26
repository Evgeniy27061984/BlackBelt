package CourcePartII.Lesson41LyamdaPart1;

import java.util.ArrayList;

public class Test56 {
    // не хороший вариант тк если return s.avgGrade > 8; например 9, надо создавать новый класс
    // для этого анонимус классы создаются
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
        StudentInfo info = new StudentInfo();
        info.testStudents(students, new CheckOverGrade());
        System.out.println("______");
        info.testStudents(students, new StudentChecks() { //анонимус классы
            @Override
            public boolean check(Student s) {
                return s.age > 30;
            }
        });
        System.out.println("______");
        info.testStudents(students,(Student s) -> { return s.course == 1;});
        //анонимус классы сокращенный
        System.out.println("______");
        info.testStudents(students,(Student s) -> { return s.avgGrade == 8.3;});
        System.out.println("______");
        info.testStudents(students,(Student s) -> { return s.avgGrade > 8.3 && s.course == 3;});

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

interface StudentChecks {
    boolean check(Student s);

}

class CheckOverGrade implements  StudentChecks{
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8.8;
    }
}
