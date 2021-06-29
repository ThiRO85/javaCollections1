package application;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorsListIteratorDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Bob");
        list.add("Alex");
        list.add("Joe");
        list.add("Anna");
        System.out.println(list);

        ListIterator list2 = list.listIterator();

        while (list2.hasNext()) {
            String item = (String) list2.next();
            if (item.equals("Alex")) {
                list2.add("Will");
            }
            if (item.equals("Anna")) {
                list2.remove();
            }
            if (item.equals("Bob")) {
                list2.set("Tom");
            }
        }
        System.out.println(list);
    }
}
