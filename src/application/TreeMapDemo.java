package application;

import java.util.*;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap a = new TreeMap();
        a.put(37, "Bob");
        a.put(28, null);
        a.put(13, "Maria");
        a.put(37, "Alex");
        System.out.println(a);

        MySorting ms = new MySorting();
        TreeMap b = new TreeMap(ms);
        b.put(37, "Bob");
        b.put(28, null);
        b.put(13, "Maria");
        b.put(37, "Alex");
        System.out.println(b);

        SortedMap sm = new TreeMap();
        TreeMap c = new TreeMap(sm);
        c.put(37, "Bob");
        c.put(28, null);
        c.put(13, "Maria");
        c.put(37, "Alex");
        System.out.println(c);

        Map map = new LinkedHashMap();
        TreeMap d = new TreeMap(map);
        d.put(37, "Bob");
        d.put(28, null);
        d.put(13, "Maria");
        d.put(37, "Alex");
        System.out.println(d);
    }
}
