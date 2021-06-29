package application;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentDemo extends Thread {

    private static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        ConcurrentDemo cd = new ConcurrentDemo();

        list.add("Maria");
        list.add("Daniela");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        Iterator it = list.iterator();

        cd.start();

        while (it.hasNext()) {
            String names = (String) it.next();
            System.out.println("Main thread iterating -> " + names);
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
        list.add("Joe");
    }
}
