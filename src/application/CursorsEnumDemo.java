package application;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CursorsEnumDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vector v = new Vector();

        for (int i=1; i<=5; i++) {
            System.out.print("Enter element #" + i + ": ");
            Integer n = sc.nextInt();
            v.add(n);
        }
        System.out.println("Vector: " + v);

        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
            Integer element = (Integer) e.nextElement();
            if (element % 3 == 0) {
                System.out.println(element);
            }
        }
        sc.close();
    }
}
