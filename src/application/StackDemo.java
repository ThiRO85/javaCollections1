package application;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack a = new Stack();
        a.push(10);
        a.push("Maria");
        a.push(true);
        System.out.println(a);

        Object b = a.pop();
        System.out.println(b);
        System.out.println(a);

        Object c = a.peek();
        System.out.println(c);
        System.out.println(a);

        System.out.println(a.empty());
        System.out.println(a.search("Maria"));
    }
}
