package CourcePartII.Lesson59FindFirst;

import CourcePartII.Lesson48StreamsFilter.Student;

import java.util.ArrayList;
import java.util.List;

public class Test78 {
    public static void main(String[] args) {
        Student st1 = new Student("Alex", 'm', 6, 2, 8.3);
        Student st2 = new Student("Alina", 'w', 3, 1, 6.4);
        Student st3 = new Student("Max", 'm', 13, 3, 8.9);
        Student st4 = new Student("Svetlana", 'w', 34, 3, 7);
        Student st5 = new Student("I", 'm', 38, 2, 9.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        //Имена - заглавными
        //фильтр по полу только w
        //сортировка по возрасту
        //вывести на экран

        Student first = students.stream().map(e ->
        {e.setName(e.getName().toUpperCase());
            return e;
        })
                .filter(e -> e.getSex() == 'w')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .findFirst().get();
        System.out.println(first);
//        Student{name='ALINA', sex=w, age=3, course=1, avgGrade=6.4}

    }
}
