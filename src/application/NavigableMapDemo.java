package application;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

    public static void main(String[] args) {

        NavigableMap<String, Integer> map = new TreeMap<>();
        map.put("ABC", 123);
        map.put("DEF", 456);
        map.put("GHI", 789);
        map.put("JKL", 234);
        map.put("MNO", 567);
        map.put("PQR", 891);
        System.out.println(map);

        //System.out.println(map.ceilingEntry("GHI"));
        //System.out.println(map.floorKey("JKL"));
        //System.out.println(map.higherKey("DEF"));
        //System.out.println(map.lowerKey("MNO"));
        //System.out.println(map.ceilingKey("PQR"));
        System.out.println(map.descendingKeySet());
        System.out.println(map.descendingMap());
        System.out.println(map.headMap("MNO"));
        System.out.println(map.headMap("MNO", true));
        System.out.println(map.subMap("DEF", "MNO"));
        //System.out.println(map.subMap("DEF", true, "MNO", false));
        //System.out.println(map.tailMap("JKL"));
        //System.out.println(map.tailMap("JKL", false));
        //System.out.println(map.higherEntry("ABC"));
        //System.out.println(map.navigableKeySet());
    }
}
