package application;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemoII extends Thread {

    //private static HashMap<Integer, String> map = new HashMap<>();
    private static ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

    public static void main(String[] args) {

        ConcurrentHashMapDemoII cd = new ConcurrentHashMapDemoII();

        map.put(10, "Louise");
        map.put(5, "Joe");
        map.put(8, "Daniela");
        map.put(7, "Maria");
        map.put(4, "Alex");

        Iterator it = map.entrySet().iterator();

        cd.start();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            try {
                Thread.sleep(100L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        try {
            Thread.sleep(100L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put(9, "Carl");
    }
}
