package application;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList a = new ArrayList();

        ArrayList b = new ArrayList(3);

        ArrayList c = new ArrayList(b);

        a.add("Maria");
        a.add(true);
        a.add(10);
        System.out.println(a);

        a.remove(1); //Using index
        System.out.println(a);
        
        a.remove(new Integer(10)); //Using object
        //a.remove(new String("Maria"));
        System.out.println(a);

        //String test = a.get(0); Compile error, no type safety
    }
}
