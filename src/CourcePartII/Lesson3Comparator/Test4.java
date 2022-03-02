package CourcePartII.Lesson3Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {

        // для String необходимо использовать Comparator так как нельзя переписать Comparable
        List<Employee2> list = new ArrayList<>();
        Employee2 emp1 = new Employee2(100, "Zaur", "Ivanov", 12345);
        Employee2 emp2 = new Employee2(10, "Alex", "Petrov", 6542);
        Employee2 emp3 = new Employee2(5, "Ivan", "Sidorov", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list);


        Collections.sort(list, new NameComparator2()); // if Comparator
        Collections.sort(list); // if Comparable
        System.out.println(list);

    }
}

class Employee2 implements Comparable<Employee2> {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee2(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }




    @Override
    public int compareTo(Employee2 o) {
        return 0;
    }


}

class NameComparator2 implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SalaryComparator2 implements Comparator<Employee2> {
    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.salary - o2.salary;
    }
}