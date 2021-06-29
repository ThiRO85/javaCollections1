package application;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList a = new LinkedList();

        //LinkedList b = new LinkedList(a);

        a.add("Maria");
        a.add(false);
        a.add(null);
        System.out.println(a);

        a.set(1, 10);
        System.out.println(a);

        a.add(2, true);
        System.out.println(a);

        a.addFirst('T');
        System.out.println(a);

        a.removeIf(x -> x == null);
        System.out.println(a);
    }
}
