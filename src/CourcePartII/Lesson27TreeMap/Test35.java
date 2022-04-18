package CourcePartII.Lesson27TreeMap;

import java.util.Objects;
import java.util.TreeMap;

public class Test35 {
    public static void main(String[] args) {
        //TreeMap - отсортированный по возрастанию про ключу
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Max", "Maslov",4);
        Student st2 = new Student("Alex", "Obanin",3);
        Student st3 = new Student ("Alina", "Obanina",2);
        Student st4 = new Student("Max", "Maslov",4);
        Student st5 = new Student("Alex", "Obanin",3);
        Student st6 = new Student ("Alina", "Obanina",2);
        Student st7 = new Student("Max", "Maslov",4);
        treeMap.put(5.8, st1);
        treeMap.put(7.2, st3);
        treeMap.put(6.4, st2);
        treeMap.put(7.1, st5);
        treeMap.put(7.5, st4);
        treeMap.put(7.8, st6);
        treeMap.put(7.1, st7);
        System.out.println(treeMap);
        //5.8=Student{name='Max', surname='Maslov', course=4},
        // 6.4=Student{name='Alex', surname='Obanin', course=3},
        // 7.1=Student{name='Max', surname='Maslov', course=4},
        // 7.2=Student{name='Alina', surname='Obanina', course=2},
        // 7.5=Student{name='Max', surname='Maslov', course=4},
        // 7.8=Student{name='Alina', surname='Obanina', course=2}}
        //работает быстро но не быстрее HashMap
        //с одинаковыми ключами нельзя добавлять
        System.out.println(treeMap.get(5.8)); //Student{name='Max', surname='Maslov', course=4}
        System.out.println(treeMap.remove(5.8));//удаляет
        System.out.println(treeMap.descendingMap());//по убыванию становится
        System.out.println(treeMap.tailMap(7.1)); //>= 7.1
        System.out.println(treeMap.headMap(7.1)); //< 7.1
        System.out.println(treeMap.lastEntry());//element in end
        System.out.println(treeMap.firstEntry());//element in start
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
                return name.length()*7 + surname.length()*8 + course*9;
    }
}
