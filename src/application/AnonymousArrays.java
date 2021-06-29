package application;

public class AnonymousArrays {

    public static void main(String[] args) {

        sum(new int[]{1, 2, 3});
    }

    private static void sum(int[] x) {
        int y = 0;
        for (int i : x) {
            y += i;
        }
        System.out.println(y);
    }
}
