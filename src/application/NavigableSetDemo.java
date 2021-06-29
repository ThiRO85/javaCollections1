package application;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

    public static void main(String[] args) {

        NavigableSet<Integer> a = new TreeSet<>();
        a.add(10);
        a.add(45);
        a.add(99);
        a.add(135);
        a.add(225);
        System.out.println(a);

        System.out.println(a.floor(100)); //Less or equal the parameter

        System.out.println(a.lower(100)); //Less than the parameter

        System.out.println(a.ceiling(100)); //Greater or equal the parameter

        System.out.println(a.higher(100)); //Greater than the parameter

        System.out.println(a.pollFirst()); //Retrieve and remove the first element

        System.out.println(a.pollLast()); //Retrieve and remove the last element

        System.out.println(a.descendingSet()); //It returns NavigableSet in reverse order
    }
}
