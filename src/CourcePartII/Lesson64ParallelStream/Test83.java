package CourcePartII.Lesson64ParallelStream;

import CourcePartII.Lesson48StreamsFilter.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test83 {
    public static void main(String[] args) {
        //метод подходит для нахождения минимума максимума и т.п.
        //не подходит когда наши действия над элементами зависит от их очередности
        //параллельность используют когда много элементов

        List <Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.stream().reduce((accumulator, element) -> accumulator + element).get();
        System.out.println(sumResult); //16.25

        double sumResult2 = list.parallelStream().reduce((accumulator, element) -> accumulator + element).get();
        System.out.println(sumResult2); //16.25


        double divisionResult = list.stream().reduce((accumulator, element) -> accumulator/element).get();
        System.out.println(divisionResult); //8.0

        double divisionResult2 = list.parallelStream().reduce((accumulator, element) -> accumulator/element).get();
        System.out.println(divisionResult2); //0.5 не правильно
        //10/5=2
        //1/0.25=4
        //2/4=0.5
    }
}

