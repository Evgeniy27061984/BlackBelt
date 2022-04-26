package CourcePartII.Lesson31TreeSet;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Test42 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Max", 4);
        Student st2 = new Student("Alex", 3);
        Student st3 = new Student("Alina", 2);
        Student st4 = new Student("Max", 4);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        System.out.println(treeSet);
        //[Student{name='Alina', course=2}, Student{name='Alex', course=3}, Student{name='Max', course=4}]
        System.out.println(treeSet.first());//Student{name='Alina', course=2}
        System.out.println(treeSet.last());//Student{name='Max', course=4
        Student st5 = new Student("Svetlana", 2);
        Student st6 = new Student("I", 4);
        System.out.println(treeSet.headSet(st5));
        // [Student{name='Alina', course=2}, Student{name='Alex', course=3}] ниже 4 курса
        System.out.println(treeSet.tailSet(st5));//[Student{name='Max', course=4}]
        System.out.println(treeSet.subSet(st5,st6));//[Student{name='Alina', course=2}, Student{name='Alex', course=3}]
        System.out.println(st5.equals(st3));//true
        //if a.equals(b) and a.compareTo(b) true
        System.out.println(st5.hashCode()==st3.hashCode());//true
    }
}

class Student implements Comparable<Student> {
    String name;
    int course;


    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }
}
