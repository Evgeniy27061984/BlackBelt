package CourcePartII.Lesson19CollectionsBinarySearch;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test26 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(2,"Alina",1);
        Employee emp2 = new Employee(1,"Max",3);
        Employee emp3 = new Employee(4,"Alex",2);
        Employee emp4 = new Employee(1,"M",5);
        Employee emp5 = new Employee(8, "Svetlana",4);
        Employee emp6 = new Employee(3,"Ia",5);
        Employee emp7 = new Employee(8, "SvetlanaR",4);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        System.out.println(employeeList);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index = Collections.binarySearch(employeeList,new Employee(2,"Alina",1));
        System.out.println(index);

    }
}

class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int course;

    public Employee(int id, String name, int course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
//        if(result == 0) {
//            result  = this.name.compareTo(o.name);
//        }
        return result;
    }
}
