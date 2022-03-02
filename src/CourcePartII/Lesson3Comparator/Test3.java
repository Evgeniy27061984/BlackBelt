package CourcePartII.Lesson3Comparator;

import java.util.*;


public class Test3 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Ivanov", 12345);
        Employee emp2 = new Employee(10, "Alex", "Petrov", 6542);
        Employee emp3 = new Employee(5, "Ivan", "Sidorov", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println(list);


        Collections.sort(list, new IDComparator()); // two arguments
        Collections.sort(list, new NameComparator()); // two arguments
        Collections.sort(list, new SalaryComparator()); // two arguments
        System.out.println(list);

    }
}

class Employee
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
}

class IDComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.id == o2.id) {
            return 0;
        } else if (o1.id < o2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
     return o1.name.compareTo(o2.name);
    }
}
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary-o2.salary;
    }
}