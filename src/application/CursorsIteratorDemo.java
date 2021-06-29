package application;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorsIteratorDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(18);
        list.add(25);
        list.add(33);

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            Integer n = (Integer) itr.next();
            if (n % 3 == 0) {
                System.out.println(n);
            }
            else {
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
