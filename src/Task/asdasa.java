package Task;

import java.util.Arrays;
import java.util.HashMap;

public class asdasa {

    public static void main(String[] args) {
        Map1<String, Integer> mapa = new Map1<>();

        mapa.put("Alicja",4);
        mapa.put("Karolina",5);
        mapa.put("Daniel",3);
        mapa.put("Dawid",2);
        mapa.put("Emilka",1);
        mapa.put("Marzena",5);
        mapa.put("Kamil",7);
        mapa.put("Daniel",11);
        mapa.put("Daniel",14);
        mapa.put("Daniel",15);
        mapa.put("Daniel",20);



     //   mapa.remove("Daniel");
        System.out.println(mapa.get("Dawid"));
        System.out.println(mapa.remove("Daniel"));
        System.out.println(mapa);

    }
}

class Map1<K, T>{
    private HashMap<K,T> mapa = new HashMap<>();

    public void put (K key, T value){
        this.mapa.put(key,value);
    }
    public T get(K key){
        return this.mapa.get(key);
    }
    public T remove(K key){
        return this.mapa.remove(key);
    }
}