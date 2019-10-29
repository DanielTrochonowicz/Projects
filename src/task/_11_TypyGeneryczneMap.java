package task;

import java.util.HashMap;

public class _11_TypyGeneryczneMap {
    public static void main(String[] args) {

        Map<String, Integer> mapa = new Map<>();

        mapa.put("Alicja",1);
        mapa.put("Bartosz",2);
        mapa.put("Celina",3);
        mapa.put("Dawid",4);
        mapa.put("Emilka",5);
        mapa.put("Filip",6);
        mapa.put("Grzegorz",7);
        mapa.put("Halina",8);


        System.out.println(mapa);
        System.out.println(mapa.remove("Bartosz"));
        System.out.println(mapa);
        System.out.println(mapa.get("Emilka"));
        System.out.println(mapa);
    }
}
class Map<K, V>{

    private HashMap<K,V> mapa = new HashMap<>();


    public void put (K key, V value){
        this.mapa.put(key,value);
    }

    public V get(K key){
        return this.mapa.get(key);
    }

    public V remove(K key){
        return  this.mapa.remove(key);
    }

    @Override
    public String toString() {
        return "Map: " +
                "Mapa: " + mapa;
    }
}

