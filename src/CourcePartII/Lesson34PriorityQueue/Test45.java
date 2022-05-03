package CourcePartII.Lesson34PriorityQueue;

import java.util.PriorityQueue;

public class Test45 {
    //вызов самого высшего по приоритету
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        //[1, 4, 7, 8, 10]
        System.out.println(priorityQueue.peek());//1 first element
        System.out.println(priorityQueue);
        //[1, 4, 7, 10, 8] показывает не сортированно
        //если использовать то в отсортированном

        System.out.println(priorityQueue.remove());//1
        System.out.println(priorityQueue.remove());//4
        System.out.println(priorityQueue.remove());//7
        System.out.println(priorityQueue.remove());//8
        System.out.println(priorityQueue.remove());//10


    }
}
