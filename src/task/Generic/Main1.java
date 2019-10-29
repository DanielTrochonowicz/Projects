package task.Generic;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

       BoxOnSteroids<Apple> a = new BoxOnSteroids<>(new Apple());
       BoxOnSteroids<Orange> a1 = new BoxOnSteroids<>(new Orange());

        Apple fruit = a.getFruit();
        Orange fruit1 = a1.getFruit();

        System.out.println(fruit);
        System.out.println(fruit1);
    }
}
