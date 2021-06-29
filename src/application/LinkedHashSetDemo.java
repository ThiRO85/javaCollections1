package application;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo { //Insertion order is preserved

    public static void main(String[] args) {

        LinkedHashSet a = new LinkedHashSet();

        //LinkedHashSet b = new LinkedHashSet(20);

        //LinkedHashSet c = new LinkedHashSet(25, 1.0f);

        a.add("Maria");
        a.add(10);
        a.add("Alex");
        a.add(true);
        a.add("Bob");
        a.forEach(System.out::println);

        //Underlying data structure = combination of linked list and hash table
    }
}
