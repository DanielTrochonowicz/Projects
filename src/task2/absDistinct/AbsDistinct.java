package task2.absDistinct;

import java.util.Arrays;

public class AbsDistinct {

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
