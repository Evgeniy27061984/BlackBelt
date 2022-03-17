package CourcePartII.Lesson14MethodsArrayList2Part;

import java.util.ArrayList;
import java.util.Objects;

public class Test16 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Alex");
        arrayList1.add("Max");
        arrayList1.add(1,"Misha");
        System.out.println(arrayList1);//[Ivan, Misha, Alex, Max]

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ivan2");
        arrayList2.add("Alex2");
        arrayList2.add("Max2");
        System.out.println(arrayList2);
        arrayList1.addAll(arrayList2);//[Ivan2, Alex2, Max2]
        System.out.println(arrayList1);//[Ivan, Misha, Alex, Max, Ivan2, Alex2, Max2]
        arrayList1.addAll(1, arrayList2);//[Ivan2, Alex2, Max2]
        System.out.println(arrayList1);//[Ivan, Ivan2, Alex2, Max2, Misha, Alex, Max, Ivan2, Alex2, Max2]
        arrayList1.clear();
        System.out.println(arrayList1);//[]
        arrayList1.add("Ivan");
        arrayList1.add("Alex");
        arrayList1.add("Max");
        arrayList1.add(1,"Misha");
        System.out.println(arrayList1.indexOf("Max"));//3

        ArrayList<Student> arrayList3 = new ArrayList<>();
        Student st1 = new Student("Max",13,3);
        Student st2 = new Student("Alex",6,2);
        Student st3 = new Student("Alina",2,1);
        Student st4 = new Student("Alina",2,1);
        Student st5 = new Student("Alina",2,1);
        arrayList3.add(st1);
        arrayList3.add(st2);
        arrayList3.add(st3);
        arrayList3.add(st5);
        ArrayList<Student> arrayList4 = new ArrayList<>();
        System.out.println(arrayList3.indexOf(st3));//2
        System.out.println(arrayList3.indexOf(st4));//-1 if equals don't @Override
        System.out.println(arrayList3);
        System.out.println(arrayList3.indexOf(st5));//2
        System.out.println(arrayList3.lastIndexOf(st5));//3 с конца ищет
        System.out.println(arrayList3.size());//4
        System.out.println(arrayList3.isEmpty());//false не пустой
        System.out.println(arrayList4.isEmpty());//true пустой
        System.out.println(arrayList3.contains(st1));//true если есть объект
        System.out.println(arrayList3.contains(new Student("A",2,1)));//афдыу если нет объекта
        System.out.println(arrayList3.toString());//можно не писать


    }
}

class Student {
    private String name;
    private int age;
    private int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Objects.equals(name, student.name);
    }
}
