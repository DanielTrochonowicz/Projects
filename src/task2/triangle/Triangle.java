package task2.triangle;

import java.util.Arrays;

public class Triangle {

    public static void main(String[] args) {
        Integer a = 0;
        Integer b = -5;
        System.out.println(a.compareTo(b));

    }
    public int triangle(int[] a) {
        if (a.length <= 2) {
            return 0;
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length - 2; i++) {
            if (a[i] > a[i + 2] - a[i + 1]) {
                return 1;
            }
        }return 0;
    }
}
