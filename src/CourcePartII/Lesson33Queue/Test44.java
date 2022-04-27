package CourcePartII.Lesson33Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test44 {
    public static void main(String[] args) {
        //in List don't offer
        // FIFO удаляет первого добавляет в конец

        Queue<String> queue = new LinkedList<>();
        queue.add("Alex");
        queue.add("Alina");
        queue.add("Max");
        queue.offer("Svetlana"); //don't Exception
        System.out.println(queue);//[Alex, Alina, Max]
        System.out.println(queue.remove());//Alex
        System.out.println(queue);//[Alina, Max, Svetlana]
//        System.out.println(queue.remove());//Alina
//        System.out.println(queue.remove());//Max
//        System.out.println(queue.remove());//Svetlana
//        System.out.println(queue.remove());//Exception
//        System.out.println(queue.poll());//Alina
//        System.out.println(queue.poll());//Max
//        System.out.println(queue.poll());//Svetlana
//        System.out.println(queue.poll());//null //don't Exception
        System.out.println(queue.element());//Alina может быть Exception
        System.out.println(queue.peek());//Alina не может быть Exception
        queue.remove("Max");//удаление из середины но Queue не предназначен
        System.out.println(queue);//[Alina, Svetlana]
    }
}
