package application;

import java.util.HashMap;
import java.util.WeakHashMap;

class Temp {
    @Override
    public String toString() {
        return "temp";
    }

    public void finalize() {
        System.out.println("Finalize method called");
    }
}

public class WeakHashMapDemo {

    public static void main(String[] args) throws InterruptedException {

        HashMap a = new HashMap();
        Temp temp = new Temp();
        a.put(temp, "element");
        System.out.println(a);

        temp = null;
        System.gc();
        Thread.sleep(3000L);
        System.out.println(a);

        WeakHashMap b = new WeakHashMap();
        Temp temp1 = new Temp();
        b.put(temp1, "element");
        System.out.println(b);

        temp1 = null;
        System.gc();
        Thread.sleep(3000L);
        System.out.println(b);
    }
}
