package Task.Generic;

import java.util.HashMap;
import java.util.Map;

public class Słownikowy {
    public static void main(String[] args) {

        Map<String, Integer> mapa = new HashMap<>();
        MapySwiata[] s =
                {
                new MapySwiata("Polska"),
                new MapySwiata("Niemcy"),
                new MapySwiata("Francja"),
                new MapySwiata("Wegry"),
                new MapySwiata("słowacja"),
                new MapySwiata("pakistan"),
                new MapySwiata("chiny"),
                new MapySwiata("japonia"),
                };


        for (MapySwiata mmapy : s)
            mapa.put(mmapy.wartosc,mmapy.Klucz);

        mapa.get(5);


        System.out.println(mapa);

    }
}

class MapySwiata{

    public MapySwiata(){
        i++;
        Klucz = i;
    }
    public MapySwiata(String wartosc){
        this();
        this.wartosc = wartosc;
    }

    public int Klucz;
    public static int i = 0;
    public String wartosc;

    public void put1(){
        int klucz;
        String wartosc;
    }
    public String wartosc1(){
        int klucz;
        return wartosc;
    }

    public int remove1(){
        int klucz;
        return  remove1();
    }
}


