package Sortowanie;

import java.util.*;

public class Sortowanie {
    public static void main(String[] args) {

        Map<String, String> slowaStr = new HashMap<>();
        slowaStr.put("One", "jeden");
        slowaStr.put("Two", "dwa");
        slowaStr.put("Free", "trzy");
        slowaStr.put("Four", "cztery");

        for (Map.Entry<String, String> entry : slowaStr.entrySet()){
            System.out.println("K: " + entry.getKey() + " V: " + entry.getValue());
        }

        System.out.println("=========Str2========");
        Map<String, String> slowaStr2 = new TreeMap<>(slowaStr);
        for (Map.Entry<String, String> entry2 : slowaStr2.entrySet()){
            System.out.println("K: " + entry2.getKey() + " V: " + entry2.getValue());
        }

        System.out.println("========Str3=========");
        Map<String, String> slowaStr3 = sortedByValue(slowaStr);
        for (Map.Entry<String, String> entry3 : slowaStr3.entrySet()){
            System.out.println("K: " + entry3.getKey() + " V: " + entry3.getValue());
        }


        HashSet<String> slowa = new HashSet<>();
        slowa.add("jeden");
        slowa.add("dwa");
        slowa.add("trzy");
        slowa.add("cztery");

        System.out.println("\nSłowa HashSet: " + slowa);

        TreeSet<String> slowa1 = new TreeSet<>();
        slowa1.add("jeden");
        slowa1.add("dwa");
        slowa1.add("trzy");
        slowa1.add("cztery");

        System.out.println("\nSłowa HashSet: " + slowa1);
    }

    //unchecked
    private static HashMap sortedByValue(Map map){
        List list = new LinkedList(map.entrySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2){
                return ((Comparable) ((Map.Entry) o1).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();){
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }return sortedHashMap;
    }
}
