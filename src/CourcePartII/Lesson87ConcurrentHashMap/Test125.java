package CourcePartII.Lesson87ConcurrentHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Test125 {
    public static void main(String[] args) throws InterruptedException {
        //HashMap<Integer,String> map = new HashMap<>();
        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
        map.put(1, "I");
        map.put(2, "Svetlana");
        map.put(3, "Max");
        map.put(4, "Alex");
        map.put(5, "Alina");
        //map.put(5, null);//нельзя
        //map.put(null, "Э");//нельзя
        System.out.println(map);

        Runnable runnable1 = () -> {
            Iterator<Integer>  iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Integer i = iterator.next();
                System.out.println(i + " " + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "Max2");
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(map);
    }
}

