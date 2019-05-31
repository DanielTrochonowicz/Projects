package Task;
import java.util.ArrayList;
import java.util.HashSet;
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

        java.util.Set<String> sets = new HashSet<>();
        sets.add("hello");
        sets.add("asdcde");
        sets.add("cdeasda");
        sets.add("gole");

        System.out.println(task6(sets));


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

    public static boolean task6(java.util.Set<String> numberString) {

        for (String start : numberString) {
            if (start.endsWith("cde"))
                return true;
        }
        return false;
    }
}

