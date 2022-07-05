package CourcePartII.Lesson43Predicate;


import CourcePartII.Lesson41LambdaPart1.Student;



import java.util.ArrayList;
import java.util.function.Predicate;
//фильтрация
public class Test60 {
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


        info.testStudents(students,(Student s) -> { return s.course == 1;});
        //анонимус классы сокращенный
        //Student{name='Alina', sex=w, age=3, course=1, avgGrade=6.4}
        info.testStudents(students,(Student s) -> { return s.course > 2;});
        // Student{name='Max', sex=m, age=13, course=3, avgGrade=8.9}
        // Student{name='Svetlana', sex=w, age=34, course=3, avgGrade=7.0}

    }
}


class StudentInfo {
    void testStudents(ArrayList<Student> a1, Predicate<Student> pr) {
        for (Student s: a1) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}