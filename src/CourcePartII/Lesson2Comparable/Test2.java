package CourcePartII.Lesson2Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Ivanov", 12345);
        Employee emp2 = new Employee(10, "Alex", "Petrov", 6542);
        Employee emp3 = new Employee(5, "Ivan", "Sidorov", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list);
        //Collections.sort(list); error java don't know how to sort

        Arrays.sort(new Employee [] {emp1,emp2,emp3});// also need Comparable
        Employee [] e = new Employee[] {emp1,emp2,emp3};
        Arrays.sort(e);
        System.out.println(Arrays.toString(e));

        Collections.sort(list); // if have Comparable
        System.out.println(list);

    }
}
class Employee implements Comparable <Employee>
{
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        if (this.id == o.id) {
//            return 0;
//        } else if (this.id < o.id) {
//            return -1;
//        } else {
//            return 1;
//        }
//         return this.id - o.id;
//         return this.id.compareTo(o.id);//if id Integer
//            return this.name.compareTo(o.name);

        int res = this.name.compareTo(o.name);
        if (res == 0) {
            res = this.surname.compareTo(o.surname);
        }
        return  res;

    }
}
