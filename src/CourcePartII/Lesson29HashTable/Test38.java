package CourcePartII.Lesson29HashTable;

import java.util.Hashtable;
import java.util.Objects;

public class Test38 {
    public static void main(String[] args) {
        // keys and values no can null
        Hashtable<Double, Student> ht= new Hashtable<>();
        Student st1 = new Student("Max", "Maslov", 4);
        Student st2 = new Student("Alex", "Obanin", 3);
        Student st3 = new Student("Alina", "Obanina", 2);
        Student st4 = new Student("Max", "Maslov", 4);
        ht.put(5.8, st1);
        ht.put(7.2, st3);
        ht.put(6.4, st2);
        ht.put(7.5, st4);
        System.out.println(ht);

    }
}
class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println(1);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return name.length() * 7 + surname.length() * 8 + course * 9;
    }
}