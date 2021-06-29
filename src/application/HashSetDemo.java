package application;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo { //Insertion order is not preserved

    public static void main(String[] args) {

        HashSet a = new HashSet(); //Default size: 16

        //HashSet b = new HashSet(20);

        //HashSet c = new HashSet(30, .08f); //Whenever the HashSet reach 75 % (load factor) of capacity...
                                                                  //... it's size is multiplied by 2.0
        ArrayList test = new ArrayList();
        HashSet d = new HashSet(test);

        a.add("Maria");
        a.add(10);
        a.add("Alex");
        a.add(true);
        a.add("Bob");
        a.forEach(System.out::println);
    }
}
