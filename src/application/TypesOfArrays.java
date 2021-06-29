package application;

public class TypesOfArrays {

    public static void main(String[] args) {

        int[] a = new int[3];
        a[0] = 'a';
        System.out.println("int[] a = " + a[0]);

        byte b = 2;
        a[1] = b;
        System.out.println("int[] a = " + a[1]);
        System.out.println();

        Object[] obj = new Object[5];
        obj[0] = new Object();
        System.out.println("int[] obj = " + obj[0]);
        obj[1] = new String("test");
        System.out.println("int[] obj = " + obj[1]);
        System.out.println();

        Number[] n =  new Number[5];
        n[0] = new Integer(1);
        System.out.println("int[] n = " + obj[0]);
        //n[1] = new Byte("a");
        //System.out.println("int[] n = " + obj[1]);
        n[2] = new Double(5.0);
        System.out.println("int[] n = " + obj[2]);
        System.out.println();

        Runnable[] r = new Runnable[5];
        r[0] = new Thread();
        System.out.println("int[] r = " + r[0]);
    }
}
