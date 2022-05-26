package CourcePartII.Lesson41LambdaPart1;

import java.util.ArrayList;

public class Test55 {
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

        Info t = new Info();

        t.printStudentsOverGrade(students, 9);
//      Student{name='I', sex=m, age=38, course=2, avgGrade=9.1}
        System.out.println("__________");
        t.printStudentsUnderAge(students, 34);

//      Student{name='I', sex=m, age=38, course=2, avgGrade=9.1}
//      System.out.println("__________");
        t.printStudentsMixCondition(students, 8.2, 6, 'm');
//      Student{name='Max', sex=m, age=13, course=3, avgGrade=8.9}
//      Student{name='I', sex=m, age=38, course=2, avgGrade=9.1}

    }
}

class Info {
    void printStudentsOverGrade(ArrayList<Student> a, double grade) {
        for (Student s : a) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }
    void printStudentsUnderAge(ArrayList<Student> a, int age) {
        for (Student s : a) {
            if (s.age > age) {
                System.out.println(s);
            }
        }
    }
    void printStudentsMixCondition(ArrayList<Student> a, double grade, int age, char sex) {
        for (Student s : a) {
            if (s.avgGrade > grade && s.age > age && s.sex == sex) {
                System.out.println(s);
            }
        }
    }
}
