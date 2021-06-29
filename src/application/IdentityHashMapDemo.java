package application;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> a = new HashMap<>();
        a.put(10, "First");
        a.put(10, "Second");
        System.out.println(a);

        HashMap<Integer, String> b = new HashMap<>();
        Integer t = new Integer(10);
        Integer h = new Integer(10);
        b.put(t, "First");
        b.put(h, "Second");
        System.out.println(b);

        IdentityHashMap<Integer, String> c = new IdentityHashMap<>();
        c.put(10, "First");
        c.put(10, "Second");
        System.out.println(c);

        IdentityHashMap<Integer, String> d = new IdentityHashMap<>();
        d.put(t, "First");
        d.put(h, "Second");
        System.out.println(d);
    }
}
