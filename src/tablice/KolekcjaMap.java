package tablice;

import java.util.HashMap;
import java.util.Map;

public class KolekcjaMap {
    public static void main(String[] args) {

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "jeden");
        mapa.put(2, "dwa");
        mapa.put(3, "trzy");
        mapa.put(4, "cztery");
        mapa.put(5, "piec");


        System.out.println("Czy zawiera wartosc: " + mapa.containsValue("trzy"));
        System.out.println("Czy zawiera klucz: " + mapa.containsKey(6));

        for (Map.Entry<Integer, String> m : mapa.entrySet()){
            int klucz = m.getKey();
            String wartosc = m.getValue();

            System.out.println("Klucz: " + klucz + " " + "wartosc: " + wartosc);
        }

        System.out.println("Wartosc spod konkretnego klucza: " + mapa.get(2));
        System.out.println("czy zawiera wartosci: " + mapa.values());

        System.out.println("HashCode: " + mapa.hashCode());

        mapa.clear();

        System.out.println("czy zawiera wartosci: " + mapa.values());
    }
}
