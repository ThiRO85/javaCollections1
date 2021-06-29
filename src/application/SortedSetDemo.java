package application;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    public static void main(String[] args) {

        SortedSet a = new TreeSet();
        a.add(10);
        a.add(5);
        a.add(7);
        a.add(3);
        a.add(8);
        System.out.println(a);

        //Methods in SortedSet interface:

        //Object first();
        System.out.println(a.first());

        //Object last();
        System.out.println(a.last());

        //SortedSet headSet(Object o);
        System.out.println(a.headSet(7));

        //SortedSet tailSet(Object o);
        System.out.println(a.tailSet(7));

        //SortedSet subSet(Object o, Object p);
        System.out.println(a.subSet(5, 8));

        //Comparator comparator();
        System.out.println(a.comparator());
    }
}
