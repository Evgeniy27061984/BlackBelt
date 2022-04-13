package CourcePartII.Lesson24hashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test32 {
    public static void main(String[] args) {
        Map<Student,Double> map = new HashMap<>();
        Student st1 = new Student("Max", "Maslov",4);
        Student st2 = new Student("Alex", "Obanin",3);
        Student st3 = new Student("Alina", "Obanina",2);
        map.put(st1, 7.5);
        map.put(st2, 4.5);
        map.put(st3, 1.5);

        Student st4 = new Student("Alina", "Obanina",2);
        boolean result = map.containsKey(st4);
        System.out.println("result = " + result);
//         without hashCode() - false
//         with hashCode() - true
//         при работе new HashMap<>() and new HashMap<>()
        // должен переопределен equals and hashCode
        System.out.println(st1.hashCode());//-1715954317


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

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, course);
    }



}
