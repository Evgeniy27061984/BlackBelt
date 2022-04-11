package CourcePartII.Lesson23HashMap;

import java.util.HashMap;
import java.util.Map;

public class Test31 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1000, "Alex Obanina");
        map1.put(3568, "Alina Obanina");
        map1.put(7000, "Max Maslov");
        map1.put(15000, "Svetlana Maslova");
        map1.put(15000, "Svetlana Maslova");
        System.out.println(map1);//{3568=Alina Obanin, 1000=Alex Obanin, 7000=Max Maslov, 15000=Svetlana Maslov}
        map1.put(15001, "Svetlana Maslova");
        System.out.println(map1);
        //{3568=Alina Obanina, 1000=Alex Obanina, 7000=Max Maslov,
        // 15000=Svetlana Maslova, 15001=Svetlana Maslova}
        map1.put(null, "Svetlana Maslova");
        map1.put(null, null);
        System.out.println(map1);
        //{3568=Alina Obanina, null=null, 1000=Alex Obanina, 7000=Max Maslov,
        // 15000=Svetlana Maslova, 15001=Svetlana Maslova}
        // с одинаковым ключом нельзя добавлять он просто не появится
        System.out.println(map1.get(1000));//Alex Obanina
        System.out.println(map1.get(1001));//пустота
        map1.remove(15001);
        System.out.println(map1);//{3568=Alina Obanina, null=null, 1000=Alex Obanina, 7000=Max Maslov, 15000=Svetlana Maslova}
        System.out.println(map1.containsValue("Max Maslov"));//true
        System.out.println(map1.containsKey(1000));//true
        System.out.println(map1.keySet());//[3568, null, 1000, 7000, 15000]
        System.out.println(map1.values());//[Alina Obanina, null, Alex Obanina, Max Maslov, Svetlana Maslova]
        map1.entrySet();//будем разбирать после HasMap
        Map<String,String> map2 = new HashMap<>();
        map2.put("son", "Alex");
        map2.put("daughter", "Alina");
        map2.put("son", "Max");
    }
}
