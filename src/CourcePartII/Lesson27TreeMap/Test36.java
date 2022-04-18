package CourcePartII.Lesson27TreeMap;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

public class Test36 {
    public static void main(String[] args) {
        //HashCode не используется в TreeMap
        //в TreeMap строится в виде сбалансированного дерева
        // no synchronised Необходимо синхронизировать вручную
        TreeMap<Student2, Double> treeMap = new TreeMap<>();

        Student2 st1 = new Student2 ("Max", "Maslov",4);
        Student2 st2 = new Student2 ("Alex", "Obanin",3);
        Student2 st3 = new Student2 ("Alina", "Obanina",2);
        Student2 st4 = new Student2 ("Max", "Maslov",4);

        treeMap.put(st1, 5.8);
        treeMap.put(st2, 7.2);
        treeMap.put(st3, 6.4);
        treeMap.put(st4, 4.4);
        System.out.println(treeMap);//implements Comparable
        //или можно так
        TreeMap<Student2, Double> treeMap2 = new TreeMap<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return 0;
            }
        });
    }
}

class Student2 implements Comparable<Student2>{
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
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return name.length()*7 + surname.length()*8 + course*9;
    }

    @Override
    public int compareTo(Student2 o) {
        return this.name.compareTo(o.name);
    }
}

