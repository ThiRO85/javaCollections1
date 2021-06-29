package application;

import java.util.ArrayList;

class Employee {
}

public class DataStructureDemo {

    public static void main(String[] args) {

        String[] a = new String[5];
        Employee[] b = new Employee[5];

        ArrayList c = new ArrayList();
        c.add("Maria");
        c.add(new Employee());
        Employee name = (Employee) c.get(0); //No type safety. Exception: ClassCastException
    }
}
