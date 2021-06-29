package application;

import java.util.TreeSet;

@FunctionalInterface
interface Test {
    void prinThi(TreeSet t);
}

public class ComparableDemo {

    public static void main(String[] args) {

        TreeSet set = new TreeSet();
        set.add(25);
        set.add(13);
        set.add(37);
        set.add(8);
        set.add(51);
        set.add(37);
        Test test = System.out::println;
        test.prinThi(set);

        TreeSet set1 = new TreeSet(new MySorting());
        set1.add(25);
        set1.add(13);
        set1.add(37);
        set1.add(8);
        set1.add(51);
        set1.add(37);
        test.prinThi(set1);
    }
}
