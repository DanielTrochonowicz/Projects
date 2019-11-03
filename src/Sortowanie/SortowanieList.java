package Sortowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortowanieList {

    public static void main(String[] args) {

        List<String> slowa = new ArrayList<>();
        slowa.add("jeden");
        slowa.add("dwa");
        slowa.add("trzy");
        slowa.add("cztery");
        slowa.add("piec");
        slowa.add("szesc");
        slowa.add("siedem");
        slowa.add("osiem");

        System.out.println(slowa);

        Collections.sort(slowa);
        System.out.println(slowa);


        Collections.sort(slowa, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(slowa);
    }
}
