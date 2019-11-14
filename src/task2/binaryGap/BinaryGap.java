package task2.binaryGap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryGap {

    public int solution(int n) {
        while (n % 2 == 0) {
            n /= 2;
        }
        String binaryNumber = Integer.toBinaryString(n);
        int biggestGap = 0;
        int temp = 0;
        Integer value;
        List<Integer> integerList = Arrays.stream(binaryNumber.split("")).map(Integer::parseInt).collect(Collectors.toList());


        if (integerList.stream().filter(c -> c == 1).count() == 1) {
            return 0;
        } else {

            for (int i = 0; i < integerList.size(); i++) {
                value = integerList.get(i);
                {
                    if (value == 0) {
                        temp++;
                        if (temp >= biggestGap) {
                            biggestGap = temp;
                        }
                    } else if (value == 1) {
                        temp = 0;
                    }
                }
            }
        }
        return biggestGap;
    }
}
