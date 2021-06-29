package application;

public class TraversingArrays {

    public static void main(String[] args) {

        int[] a = new int[] {1, 2, 3, 4, 5};
        for (int i : a) {
            System.out.println(i);
        }

        int len = a.length;
        for (int i=0; i<len; i++) {
            a[i] = i + 1;
            System.out.println("Element at index " + i + " is: " + a[i]);
        }
        System.out.println();

        int[][] b = new int[][] {{1, 2}, {3, 4}};
        for (int[] array : b) {
            for (int i : array) {
                System.out.println(i);
            }
        }
        for (int j=0; j<b.length; j++) {
            for (int k=0; k<b[j].length; k++) {
                if (j == k) {
                    System.out.println(b[j][k]);
                }
            }
        }

        for (int t=0; t<5; t++) {
            StringBuilder x = new StringBuilder(" ");
            StringBuilder y = new StringBuilder(" ");
            for (int h=0; h<4-t; h++) {
                x.append("_");
            }
            for (int g=0; g<=t; g++) {
                y.append("#");
            }
            System.out.println(x + y.toString());
        }
    }
}
