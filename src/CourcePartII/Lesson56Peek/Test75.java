package CourcePartII.Lesson56Peek;

import java.util.stream.Stream;

public class Test75 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,1,2);
        System.out.println(stream1.distinct().peek(System.out::print).count());
        //123455
    }
}
