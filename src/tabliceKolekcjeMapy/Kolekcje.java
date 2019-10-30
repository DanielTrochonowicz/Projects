package tabliceKolekcjeMapy;

import java.util.ArrayList;
import java.util.List;

public class Kolekcje {

    public static void main(String[] args) {

        String[] tabStr = new String[5];

        tabStr[0] = "aa";
        tabStr[1] = "bb";
        tabStr[2] = "cc";
        tabStr[3] = "dd";
        tabStr[4] = "ee";

        for (int x = 0; x < tabStr.length; x++){
            System.out.println(tabStr[x]);
        }

        System.out.println("====================");


        tabStr[1] = "zz";

        for (int x = 0; x < tabStr.length; x++){
            System.out.println(tabStr[x]);
        }

        System.out.println("====================");

        List<Integer> listaInt = new ArrayList<>();
        List<String> listaStr = new ArrayList<>();

        listaInt.add(1);
        listaInt.add(2);
        listaInt.add(3);
        listaInt.add(4);
        listaInt.add(5);

        listaStr.add("jeden");
        listaStr.add("dwa");
        listaStr.add("trzy");
        listaStr.add("cztery");
        listaStr.add("piec");

        for (Integer listI : listaInt) {
            System.out.println(listI);
        }

        for (String listS : listaStr) {
            System.out.println(listS);
        }

        for (int x = 0; x < listaInt.size(); x++){
            System.out.println(listaInt.get(x));
        }

        for (int x = 0; x < listaStr.size(); x++){
            System.out.println(listaStr.get(x));
        }

        listaInt.add(0, 10);
        listaInt.add(1, 20);
        listaInt.add(2, 30);
        listaInt.add(3, 40);
        listaInt.add(4, 50);
        listaStr.add(0,"nowe jeden");
        listaStr.add(1,"nowe dwa");
        listaStr.add(2,"nowe trzy");
        listaStr.add(3,"nowe cztery");
        listaStr.add(4,"nowe piec");

        for (int x = 0; x < listaInt.size(); x++){
            System.out.println(listaInt.get(x));
        }

        for (int x = 0; x < listaStr.size(); x++){
            System.out.println(listaStr.get(x));
        }

        listaInt.remove(0);
        listaInt.remove(2);
        listaInt.remove(3);
        listaInt.remove(4);

        listaStr.remove(0);
        listaStr.remove(2);
        listaStr.remove(3);
        listaStr.remove(4);

        for (int x = 0; x < listaInt.size(); x++){
            System.out.println(listaInt.get(x));
        }

        for (int x = 0; x < listaStr.size(); x++){
            System.out.println(listaStr.get(x));
        }
        System.out.println("Lista jest pusta? " + listaInt.isEmpty());

        listaInt.clear();

        for (int x = 0; x < listaInt.size(); x++){
            System.out.println(listaInt.get(x));
        }

        for (int x = 0; x < listaStr.size(); x++){
            System.out.println(listaStr.get(x));
        }

        System.out.println("Lista jest pusta? " + listaInt.isEmpty());
    }
}
