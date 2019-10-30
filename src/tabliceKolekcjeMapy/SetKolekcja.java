package tabliceKolekcjeMapy;

import java.util.*;

public class SetKolekcja {

    public static void main(String[] args) {

        Set<String> setStr = new HashSet<>();

        setStr.add("jeden");
        setStr.add("dwa");
        setStr.add("trzy");
        setStr.add("cztery");

        setStr.add("jeden");
        setStr.add("dwa");
        setStr.add("trzy");
        setStr.add("cztery");

        for (String strSet : setStr) {
            System.out.println(strSet);
        }


        System.out.println("============= Random =============");
        Set<Integer> setStr1 = new HashSet<>();

        Random r = new Random();

        while (setStr1.size() < 6){
            int x = r.nextInt(36) + 1;
            System.out.println("Wylosowano : " + x);
            setStr1.add(x);
        }
        for (Integer i : setStr1){
            System.out.println(i);
        }
        setStr1.add(20);

        System.out.println(setStr1.contains(25));
        System.out.println(setStr1.contains(20));

        System.out.println(setStr1.remove(20));
        for (Integer i : setStr1){
            System.out.println(i);
        }

        List<Integer> intList = new ArrayList<>();
        intList.addAll(setStr1);

        System.out.println("Lista");

        for (int x = 0; x < intList.size(); x++){
            System.out.println(intList.get(x));
        }
    }
}
