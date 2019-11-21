package task2.absDistinct;

import java.util.Arrays;

public class AbsDistinct {

    public static void main(String[] args) {

        int[] a = new int[10];
        a[0] = -5;
        a[1] = -3;
        a[2] = -1;
        a[3] =  0;
        a[4] =  3;
        a[5] =  6;
        a[6] =  8;
        a[7] =  10;
        a[8] =  11;

    }

    public static int absDistinct(int[] a) {
        if(a.length == 1){
            return 1;
        }
        for (int i = 0; i < a.length; i ++){
            if (a[i] <0)
                a[i] *= -1;
        }
        int distinctElements = (int) Arrays.stream(a).distinct().count();

        if (a.length == distinctElements) {
            return a.length;
        }
        return (int) Arrays.stream(a).distinct().count();
    }
}
