package application;

public class MultidimensionalArray {

    public static void main(String[] args) {

        int[]y = new int[3];
        y[0] = 12;
        y[1] = 13;
        y[2] = 14;
        System.out.println(y[0]);
        System.out.println(y[1]);
        System.out.println(y[2]);

        int[][] x = new int[3][];
        x[0] = new int[9];
        x[1] = new int[10];
        x[2] = new int[11];

        int[][][] z = new int[2][][];
        z[0] = new int[7][];
        z[1] = new int[8][];

        z[0][0] = new int[6];
        z[0][1] = new int[5];
        z[0][1] = new int[4];

        z[1][0] = new int[3];
        z[1][1] = new int[2];
        z[1][1] = new int[1];
    }
}
