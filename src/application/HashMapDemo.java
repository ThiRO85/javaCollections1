package application;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo { //Insertion order is not preserved

    public static void main(String[] args) {

        /*HashMap a = new HashMap(); //Initial capacity: 16; Load factor: 0.75;

        Map map = new HashMap(20);

        HashMap b = new HashMap(20, 0.9f);

        HashMap c= new HashMap(map);*/

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Science", null);
        map.put("Math", 80);
        map.put("English", 90);
        map.put(null, 13);
        map.put(null, 45);
        map.put("History", null);
        System.out.println(map);

        map.remove("Math");
        map.put("Science", 85);
        System.out.println(map);

        int n = map.get("English");
        System.out.println(n);

        Set<String> set = new LinkedHashSet<>();
        set = map.keySet();
        System.out.println(set);

        System.out.println(map.values());

        System.out.println(map.containsKey("Math"));

        System.out.println(map.size());

        /*for (String key : map.keySet()) {
            System.out.println(key + ", " + map.get(key));
        }
        map.forEach((k, v) -> System.out.println(k + ", " + v));*/
    }
}
