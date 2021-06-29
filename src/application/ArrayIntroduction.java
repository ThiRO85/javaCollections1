package application;

public class ArrayIntroduction {

    public static void main(String[] args) {

        int[] x = new int[10];
        System.out.println(x.getClass().getName());

        int[] y = new int[0];
        System.out.println(y);

        int[] z = new int['a'];
        System.out.println(z);

        //byte, short, char and int are allowed

        //int[] w = new int[2147483647]; Limit size to int array
    }
}
