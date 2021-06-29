package application;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] x;
        //x = {1, 2, 3};

        int[] y = {1, 2, 3, 4, 5};
        for (int t : y) {
            System.out.println(t);
            System.out.println();
        }

        int[] z = new int[3];
        System.out.println(z[1]);
        z[1] = 10;
        System.out.println(z[1]);
        System.out.println();

        int[][] a;

        int[][] b = new int[2][];

        int[][] c = {{1, 2, 3}, {4,5}};
        for (int[] array : c) {
            for (int i : array) {
                System.out.println(i);
            }
        }
    }
}
