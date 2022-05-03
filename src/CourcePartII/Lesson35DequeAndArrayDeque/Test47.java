package CourcePartII.Lesson35DequeAndArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test47 {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(5);
        arrayDeque.addLast(7);
        arrayDeque.offerFirst(1);
        arrayDeque.offerLast(8);
        System.out.println(arrayDeque);//[1, 5, 3, 7, 8]
        System.out.println(arrayDeque.removeFirst());//1
        System.out.println(arrayDeque);//[5, 3, 7, 8]
        System.out.println(arrayDeque.removeLast());//8
        System.out.println(arrayDeque);//[5, 3, 7 ]
        System.out.println(arrayDeque.pollFirst());//5
        System.out.println(arrayDeque);//[3, 7]
        System.out.println(arrayDeque.pollLast());//7
        System.out.println(arrayDeque +"+");//[3]
        System.out.println(arrayDeque.getFirst());//3
        System.out.println(arrayDeque);//3
        System.out.println(arrayDeque.peekFirst());//3
        System.out.println(arrayDeque.getLast());//3
        System.out.println(arrayDeque.peekLast());//3


    }
}
