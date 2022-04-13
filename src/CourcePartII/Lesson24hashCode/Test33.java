package CourcePartII.Lesson24hashCode;

import java.util.*;

public class Test33 {
    public static void main(String[] args) {
        Map<Student2,Double> map = new HashMap<>();
        Student2 st1 = new Student2("Max", "Maslov",4);
        Student2 st2 = new Student2("Alex", "Obanin",3);
        Student2 st3 = new Student2 ("Alina", "Obanina",2);
        map.put(st1, 7.5);
        map.put(st2, 4.5);
        map.put(st3, 1.5);

        Student2 st4 = new Student2("Alina", "Obanina",1);
        boolean result = map.containsKey(st4);
        System.out.println("result = " + result);

        System.out.println(st1.hashCode());//105



    }
}

class Student2 {
    String name;
    String surname;
    int course;

    public Student2 (String name, String surname, int course) {
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
        Student2 student = (Student2) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        System.out.println(2);
        return name.length()*7 + surname.length()*8 + course*9;
    }
}



