package application;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector a = new Vector();

        //Vector b = new Vector(10);

        //Vector c = new Vector(b);

        a.add(10);
        a.add("Maria");
        a.add('T');
        a.add(true);
        a.add(false);
        System.out.println(a);

        a.remove(4);
        System.out.println(a);

        System.out.println(a.elementAt(1));
        System.out.println(a.firstElement());
        System.out.println(a.clone());
        System.out.println(a.get(2));
    }
}
