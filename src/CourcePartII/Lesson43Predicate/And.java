package CourcePartII.Lesson43Predicate;



import java.util.ArrayList;
import java.util.function.Predicate;

public class And {
    public static void main(String[] args) {
         Student st1 = new  Student("Alex", 'm', 6, 2, 8.3);
         Student st2 = new  Student("Alina", 'w', 3, 1, 6.4);
         Student st3 = new  Student("Max", 'm', 13, 3, 8.9);
         Student st4 = new  Student("Svetlana", 'w', 34, 3, 7);
         Student st5 = new  Student("I", 'm', 38, 2, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo1 info = new StudentInfo1();
        Predicate<Student> p1 = element -> element.course == 3;
        Predicate<Student> p2 = element -> element.sex == 'w';
        info.testStudents(students,p1.and(p2));
        //Student{name='Svetlana', sex=w, age=34, course=3, avgGrade=7.0}
        info.testStudents(students,p1.or(p2));
        //Student{name='Alina', sex=w, age=3, course=1, avgGrade=6.4}
        //Student{name='Max', sex=m, age=13, course=3, avgGrade=8.9}
        //Student{name='Svetlana', sex=w, age=34, course=3, avgGrade=7.0}
        info.testStudents(students,p2.negate());
//        Student{name='Alex', sex=m, age=6, course=2, avgGrade=8.3}
//        Student{name='Max', sex=m, age=13, course=3, avgGrade=8.9}
//        Student{name='I', sex=m, age=38, course=2, avgGrade=9.1}


    }
}
class StudentInfo1 {
    void testStudents(ArrayList<Student> a1, Predicate<Student> pr) {
        for (Student s : a1) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}