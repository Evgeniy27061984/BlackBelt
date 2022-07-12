package CourcePartII.Lesson52Chaining;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test71 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
        stream1.filter(e -> {
                System.out.println("!!!");
        return  e%2==0;
        });
        // ни чего не увижу так как это не терминал метод

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,1,2,3);
        stream2.filter(e -> {
            System.out.println("!!!");
            return  e%2==0;
        }).collect(Collectors.toList());
        //!!! 8 раз
    }
}
