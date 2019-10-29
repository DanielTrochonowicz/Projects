package task;

import java.util.Arrays;
import java.util.HashSet;

public class _12_TypyGeneryczneSet {
    public static void main(String[] args) {

        Set<String> hashSet = new Set<>();

        hashSet.add("Polska");
        hashSet.add("Niemcy");
        hashSet.add("Szwecja");
        hashSet.add("Rosja");
        hashSet.add("Ukraina");
        hashSet.add("Chiny");
        hashSet.add("Japonia");
        hashSet.add("Hiszpania");

        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("Japonia"));
        System.out.println(hashSet.contains("Dawid"));
        System.out.println(Arrays.toString(hashSet.toArray()));

    }
}
class Set<E>{
    private HashSet<E> hashSet = new HashSet<>();

    public void add(E element) {
        this.hashSet.add(element);
    }
    public int size(){
        return this.hashSet.size();
    }
    public boolean contains(E element){
    return this.hashSet.contains(element);
    }

    public String[] toArray(){
        String[] tablica  = new String[hashSet.size()];
        tablica = this.hashSet.toArray(tablica);
        return tablica;
    }

    @Override
    public String toString() {
        return "Set: " +
                "HashSet: " + hashSet;
    }
}