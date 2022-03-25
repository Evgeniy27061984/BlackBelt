package CourcePartII.Lesson17LinkedList;

import java.util.LinkedList;
import java.util.Objects;

public class Test23 {
    public static void main(String[] args) {
        Student st1 = new Student("Alina",1);
        Student st2 = new Student("Max",3);
        Student st3 = new Student("Alex",2);
        Student st4 = new Student("I",5);
        Student st5 = new Student("Svetlana",4);
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);
        System.out.println(studentLinkedList);
        System.out.println(studentLinkedList.get(2));
        //начинает искать с начала или с конца массива
        //каждый элемент имеет две ссылки
        //doubleList and singleList
        Student st6 = new Student("Mother",7);
        studentLinkedList.add(2, st6); //просто меняются ссылки
        System.out.println(studentLinkedList);
        //ArrayList - get,
        //LinkedList - add, remove



    }
}
class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}