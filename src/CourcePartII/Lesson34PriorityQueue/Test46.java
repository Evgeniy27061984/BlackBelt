package CourcePartII.Lesson34PriorityQueue;



import java.util.Objects;
import java.util.PriorityQueue;

public class Test46 {
    public static void main(String[] args) {
        Student st1 = new Student("Max", 4);
        Student st2 = new Student("Alex", 3);
        Student st3 = new Student("Alina", 2);
        Student st4 = new Student("Max", 4);
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(st1);
        priorityQueue.add(st2);
        priorityQueue.add(st3);
        priorityQueue.add(st4);
        System.out.println(priorityQueue.remove());//Student{name='Alina', course=2}
        System.out.println(priorityQueue.poll());//Student{name='Alex', course=3}
        System.out.println(priorityQueue.poll());//Student{name='Max', course=4}
        System.out.println(priorityQueue.poll());//Student{name='Max', course=4}
        System.out.println(priorityQueue.poll());//null
        System.out.println(priorityQueue.poll());//null


    }
    }
        class Student implements Comparable<Student> {
            String name;
            int course;


            public Student(String name, int course) {
                this.name = name;
                this.course = course;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Student student = (Student) o;
                return course == student.course;
            }

            @Override
            public int hashCode() {
                return Objects.hash(course);
            }

            @Override
            public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", course=" + course +
                        '}';
            }

            @Override
            public int compareTo(Student o) {
                return this.course - o.course;
            }
        }


