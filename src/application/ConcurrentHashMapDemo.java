package application;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(10, "Maria");
        map.put(5, "Alex");
        map.put(7, "Louise");
        map.put(5, "Bob");
        map.put(3, "Will");
        System.out.println(map);

        map.putIfAbsent(8, "Joe");
        System.out.println(map);

        map.remove(5, "Bob");
        System.out.println(map);

        boolean test = map.replace(3, "Will", "Chuck");
        System.out.println(test);
        System.out.println(map);
    }
}
