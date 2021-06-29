package application;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    
    public static void main(String[] args) {

        TreeSet a = new TreeSet();

        //TreeSet b = new TreeSet(Comparator c);

        //SortedSet s = new TreeSet();
        //TreeSet c = new TreeSet(s);

        HashSet h = new HashSet();
        h.add("Maria");
        h.add("Bob");
        h.forEach(System.out::println);
        TreeSet d = new TreeSet(h);
        d.forEach(System.out::println);
    }
}
