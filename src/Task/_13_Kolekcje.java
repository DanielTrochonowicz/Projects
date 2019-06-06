package Task;

import java.util.*;
import java.util.Set;
import java.util.List;


public class _13_Kolekcje {

    public static void main(String[] args) {


        List<Integer> integers = new ArrayList<>();
        integers.add(14);
        integers.add(124);
        integers.add(12);
        integers.add(15);

        task1(integers);
        task2(integers);
        task3(integers);

        List<String> strings = new ArrayList<>();
        strings.add("idziemy");
        strings.add("abcdefg");
        strings.add("abdcc");
        strings.add("abc");
        strings.add("idziemy");
        strings.add("abcdefg");
        strings.add("abdcc");

        System.out.println(task4(strings));
        task5(strings);

        Set<String> sets = new HashSet<>();
        sets.add("hello");
        sets.add("asdcde");
        sets.add("cdeasda");
        sets.add("gole");

        System.out.println(task6(sets));

        List<String> convertListToSet = new ArrayList<>();
        convertListToSet.add("polek1");
        convertListToSet.add("polek45");
        convertListToSet.add("polek2");
        convertListToSet.add("polek8");
        convertListToSet.add("polek45");

        System.out.println(task7(convertListToSet));

        Set<String> convertSetToList = new HashSet<>();
        convertSetToList.add("kiwi1");
        convertSetToList.add("kiwi6");
        convertSetToList.add("kiwi7");
        convertSetToList.add("kiwi7");

        System.out.println(task8(convertSetToList));


//        Converter<String> converter = new Converter<>();
//        System.out.println(converter.toList(convertSetToList));
//        System.out.println(converter.toSet(convertListToSet));

        System.out.println(Converter.toList(convertSetToList));
        System.out.println(Converter.toSet(convertListToSet));

    }
    public static void task1(List<Integer> numberSize) {

        for (int i = 0; i < numberSize.size(); i++) {
        }
        System.out.println("Zawartosc Listy: " + numberSize);
    }
    public static double task2(List<Integer> numberSum) {

        double srednia = 0;
        for (Integer number : numberSum)
            srednia += number;
        srednia /= numberSum.size();
        System.out.println("Srednia: " + srednia);
        return srednia;
    }
    public static void task3(List<Integer> numberSizeIndex) {

        for (int i = 0; i < numberSizeIndex.size(); i++){
            numberSizeIndex.get(i);
            System.out.println("Index: " + i + " " + "Element listy: " + numberSizeIndex.get(i));
        }
    }
    public static boolean task4(List<String> numberString) {

        for (String start : numberString){
            if (start.startsWith("abc"))
                return true;
        }return false;
    }
    public static void task5(List<String> numberString) {
        for (int i = 0; i < numberString.size(); i++) {
            if (numberString.size() % 2  == 0) {

            }System.out.println("Even numbers: " + i);
        }
    }
    public static boolean task6(Set<String> numberString) {

        for (String start : numberString) {
            if (start.endsWith("cde"))
                return true;
        }
        return false;
    }
    public static Set<String> task7(List<String> listToSet) {

        Set<String> setList = new HashSet<>();
        for (String convert : listToSet){
            setList.add(convert);
        }return setList;
    }
    public static Set<String> listToSet(){
        Set<String> collection = new HashSet<>();
        collection.addAll(collection);
        return collection;
    }

    public static List<String> task8(Set<String> setToList) {

        List<String> listSet = new ArrayList<>();
        for (String convert : setToList){
            listSet.add(convert);
        }return listSet;
    }
    public static List<String> setToList(){
        List<String> collection = new ArrayList<>();
        collection.addAll(collection);
        return collection;
    }
}
class Converter<T>{
    private  ArrayList<T> list = new ArrayList<>();
    private  HashSet<T> set = new HashSet<>();

    public static<T> List<T> toList(Set<T> setToList) {
        List<T> listSet = new ArrayList<>();
        for (T convert : setToList) {
            listSet.add(convert);
        }
        return  listSet;
    }
    public static<T> Set<T> toSet(List<T> listToSet){
        Set<T> setList = new HashSet<>();
        for (T convert : listToSet){
            setList.add(convert);
        }
        return setList;
    }
}

