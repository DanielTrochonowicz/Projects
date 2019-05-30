package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kolekcje {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(14);
        integers.add(124);
        integers.add(12);
        integers.add(15);

        System.out.println(task1(integers));
        task2(Collections.singletonList(integers));


    }

    public static List<Integer> task1(List<Integer> numberSize) {
        List<Integer> zad1 = new ArrayList<>();
        for (int i = 0; i < zad1.size(); i++) {
        }
        return numberSize;
    }
    public static int task2(List<List<Integer>> numberSum) {

        int sum = 0;
        for (List<Integer> number : numberSum)
            for (int i : number) {
                sum += i;
            }System.out.println(sum);
        return sum;
    }
}

