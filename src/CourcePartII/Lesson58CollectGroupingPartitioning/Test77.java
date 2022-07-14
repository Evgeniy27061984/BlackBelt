package CourcePartII.Lesson58CollectGroupingPartitioning;

import CourcePartII.Lesson48StreamsFilter.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class Test77 {
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

//       Map<Integer, List<Student>> map =  students.stream().map(e1 -> {
//                e1.setName(e1.getName().toUpperCase());
//        return e1;
//        })
//            .collect(Collectors.groupingBy(e1 -> e1.getCourse()));
//
//       for(Map.Entry<Integer, List<Student>> entry: map.entrySet()) {
//           System.out.println(entry.getKey() + " " + entry.getValue().toString());
//
//        }

//        1 [Student{name='ALINA', sex=w, age=3, course=1, avgGrade=6.4}]
//        2 [Student{name='ALEX', sex=m, age=6, course=2, avgGrade=8.3}, Student{name='I', sex=m, age=38, course=2, avgGrade=9.1}]
//        3 [Student{name='MAX', sex=m, age=13, course=3, avgGrade=8.9}, Student{name='SVETLANA', sex=w, age=34, course=3, avgGrade=7.0}]




        Map<Boolean, List<Student>> map =
                students.stream()
            .collect(Collectors.partitioningBy(e1 -> e1.getAvgGrade() > 7));

       for(Map.Entry<Boolean, List<Student>> entry: map.entrySet()) {
           System.out.println(entry.getKey() + " " + entry.getValue().toString());

        }
//        false [Student{name='Alina', sex=w, age=3, course=1, avgGrade=6.4}, Student{name='Svetlana', sex=w, age=34, course=3, avgGrade=7.0}]
//        true [Student{name='Alex', sex=m, age=6, course=2, avgGrade=8.3}, Student{name='Max', sex=m, age=13, course=3, avgGrade=8.9}, Student{name='I', sex=m, age=38, course=2, avgGrade=9.1}]

    }


}
