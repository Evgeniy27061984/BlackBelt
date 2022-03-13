package CourcePartII.Lesson9Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
        // list.add("A");//нельзя делать
        //List<Number> list = new ArrayList<String>();
        //bounded wildcard
        List<? extends Number> list30 = new ArrayList<Integer>();//ниже класс
        List<? super Number> list32 = new ArrayList<Object>();//выше класс
        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListIngo(list1);


        double summ = new Test11().summ(list1);
        System.out.println(summ);
    }

    static void showListIngo(List<?> list) {
        System.out.println(list);
    }

    public double summ(List<? extends Number> al) {
        double summ = 0;
        for (Number n : al) {
            summ += n.doubleValue();
        }
        System.out.println(summ);
        return summ;
    }
}
