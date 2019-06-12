package Task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _15_Strumienie {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("abc", "abcdefg",
                "def", "idziemy", "abcdefg", "asdsa");

        task1(stringList);
        System.out.println(task2(stringList));
        System.out.println(task3(stringList));
        System.out.println(task4(stringList));
        System.out.println(task5(stringList));
    }
    public static void task1(List<String> stringList) {
        stringList.stream().filter(s -> s.length() > 3)
                .forEach(System.out::println);
    }
    public static List<String> task2(List<String> stringList) {
        return stringList.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());
    }
    public static List<String> task3(List<String> stringList) {
        return stringList.stream().map(s -> s.substring(0,2))
                .collect(Collectors.toList());
    }

    public static long task4(List<String> stringList) {
        return stringList.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.endsWith("a"))
                .count();
    }
    public static List<String> task5(List<String> stringList) {
        return stringList.stream()
                .map(s -> s.substring(0, s.length() - 1))
                .filter(s -> s.length() > 2)
                .collect(Collectors.toList());
    }
}