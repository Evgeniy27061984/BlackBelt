package CourcePartII.Lesson55Count;

import java.util.stream.Stream;

public class Test74 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,1,2);
        //System.out.println(stream1.count());//8
        System.out.println(stream1.distinct().count());
        //повторно нельзя использовать  Закоментируем вверх тогда 5
    }
}
