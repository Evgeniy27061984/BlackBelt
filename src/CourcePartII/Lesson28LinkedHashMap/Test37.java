package CourcePartII.Lesson28LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.TreeMap;

public class Test37 {
    public static void main(String[] args) {
        //порядок остается
        LinkedHashMap<Double, Student> ihm =
                new LinkedHashMap<>(16,0.75f,true);
        Student st1 = new Student("Max", "Maslov", 4);
        Student st2 = new Student("Alex", "Obanin", 3);
        Student st3 = new Student("Alina", "Obanina", 2);
        Student st4 = new Student("Max", "Maslov", 4);

        ihm.put(5.8, st1);
        ihm.put(7.2, st3);
        ihm.put(6.4, st2);
        ihm.put(7.5, st4);
        System.out.println(ihm);

        System.out.println(ihm.get(5.8));
        System.out.println(ihm.get(7.5));
        //при true по использовании будут размещаться эелементы
        System.out.println(ihm);

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


