package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    private static ArrayList<String> list = new ArrayList<>();
    //private static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {

        list.add("Daniela");
        list.add("Maria");
        list.add("Joe");
        list.add("Louise");
        list.add("Alex");
        System.out.println(list);

        Iterator it = list.iterator();

        while (it.hasNext()) {
            String name = (String) it.next();
            if (name.equals("Joe")) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
