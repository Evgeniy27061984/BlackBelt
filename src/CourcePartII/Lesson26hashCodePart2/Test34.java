package CourcePartII.Lesson26hashCodePart2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test34 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(16,0.75f);
        //16 - вместимость, 0.75 - как только массив заполнится на 75% массив увеличиться вдвое
        //если HashCode сделать например 3 то это будет LinkedList и будет занимать O(n) а не О(1)
        //n это количество действий а именно где находится необходимый эелемнт по порядку
        //в Java 8 сделали так что до какого то момента хранится в LinkedList а потом в сбалансированном дереве
        // справа большие эелементы слева - маленькие и скорость будет О(logn)
        // key должны быть immutable - поля сделать final
        //HashMap - not synchronized не используют в поточных
        Map<Student, Double> map2 = new HashMap<>();
        Student st1 = new Student("Max", "Maslov",4);
        Student st2 = new Student("Alex", "Obanin",3);
        Student st3 = new Student ("Alina", "Obanina",2);
        map2.put(st1, 7.5);
        map2.put(st2, 4.5);
        map2.put(st3, 1.5);
        System.out.println(map2.containsKey(st1));// true HashCode 105
        st1.name = "A";
        System.out.println(map2.containsKey(st1));// false HashCode 91

    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student (String name, String surname, int course) {
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
        System.out.println(name.length()*7 + surname.length()*8 + course*9);
        return name.length()*7 + surname.length()*8 + course*9;
    }
}
