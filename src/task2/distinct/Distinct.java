package task2.distinct;

import java.util.Arrays;

public class Distinct {

    public int distinct(int[] A) {
        if (A.length == 0)
            return 0;
        return (int) Arrays.stream(A)
                .distinct()
                .boxed()
                .count();
    }
}
