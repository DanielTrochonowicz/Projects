package task;
import java.util.*;
import java.util.Map;


public class _14_Mapy {

    public static void main(String[] args) {

        Map<String, String> capitalByCountry = new HashMap<>();
        capitalByCountry.put("Polska", "Warszawa");
        capitalByCountry.put("Niemcy", "Berlin");
        capitalByCountry.put("Francja", "Paryż");

        for (Map.Entry<String, String> capital : capitalByCountry.entrySet()) {
            System.out.println("Key: " + capital.getKey() + " Value: " + capital.getValue());
        }


        List<String> listy = new ArrayList<>();
        listy.add("Polska");
        listy.add("Niemcy");
        listy.add("Francja");
        listy.add("Chiny");

        System.out.println(task1(listy));


        Map<String, String> capitalByCountry12 = new HashMap<>();
        capitalByCountry12.put("Polska", "Warszawa124");
        capitalByCountry12.put("Niemcy", "Berlin1432321");
        capitalByCountry12.put("Francja", "Paryż214");
        capitalByCountry12.put("Francja1", "Paryż123");
        capitalByCountry12.put("Francja3", "Paryż2");
        capitalByCountry12.put("Francja2", "Paryż213");

        System.out.println(task2(capitalByCountry12));

    }

    public static Map<Integer, String> task1(List<String> indexWartosc) {

        Map<Integer, String> listToMap = new HashMap<>();
        for (int i = 0; i < indexWartosc.size(); i++)
            listToMap.put(i, indexWartosc.get(i));
        return listToMap;
    }

    public static Map<String, String> task2(Map<String, String> toMap) {

        for (int i = 0; i < toMap.size(); i++) {
            toMap.keySet();
            toMap.values();
        }
        return toMap;
    }

}

