package CourcePartII.Lesson50Reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test67 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);
        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();
        System.out.println(result);//960
        //accumulator = 5 40 80 320 960
        //element = 8 2 4 3

//        List<Integer> list100 = new ArrayList<>();
//        int result2 = list100.stream().reduce((accumulator, element) ->
//                accumulator * element).get();
//        System.out.println(result2);//Exception in thread "main" java.util.NoSuchElementException
        //что не было exception необходимо

        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o = list100.stream().reduce((accumulator, element) ->
                accumulator * element);
        if(o.isPresent()) {
            System.out.println(o.get());
        }else {
            System.out.println("not present");//not present
        }

        int result2 = list.stream().reduce(1,(accumulator, element) ->
                accumulator * element); //get не нужен так null не может быть
        System.out.println(result);//960
        //accumulator = 5 40 80 320 960
        //element = 5 8 2 4 3

    }
}
