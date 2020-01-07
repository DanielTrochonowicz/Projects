package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomTab {
    public static void main(String[] args) {

        Random random = new Random();

        int tab = random.nextInt(50);

        System.out.println(tab);

    }
}
