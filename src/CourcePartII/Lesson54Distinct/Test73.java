package CourcePartII.Lesson54Distinct;

import java.util.stream.Stream;

public class Test73 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,1,2);
        stream1.distinct().forEach(System.out::println);
        //12345
    }
}
