package application;

public class VariablesAssignments {

    public static void main(String[] args) {

        int t = 1;
        do {
            System.out.println("test");
            t++;
        }
        while (t < 3);

        int[] a = new int[3];
        int[] b = a;
        a[0] = 1;
        System.out.println(a[0]);
        System.out.println(b[0]);

        b[1] = 2;
        System.out.println(a[1]);
        System.out.println(b[1]);
        System.out.println();
        
        int[] c = {1, 2, 3};
        int[] d = {4, 5};
        c = d;
        for (int i : c) {
            System.out.println(i);
        }

        String[] e = new String[3];
        Object[] f = e;
    }
}
