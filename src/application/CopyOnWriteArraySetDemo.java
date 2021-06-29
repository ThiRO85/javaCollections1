package application;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {

    public static void main(String[] args) {

        //CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

        ArrayList<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Joe");
        list.add("Louise");
        list.add("Alex");
        list.add("Joe");

        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>(list);
        System.out.println(set);
    }
}
