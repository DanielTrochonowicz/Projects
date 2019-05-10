package Task;

public class _05_Methods {
    public static void main(String[] args) {

        System.out.println("Multiply: " + multiply(4, 5));
        System.out.println("Concatenate: " + concatenate("Dan", "iel"));
        System.out.println("Multiple addition: " + multiply2(4, 5, 4, 5));
        System.out.println("Exponentiation: " + power(2, 4));
        System.out.println("Occurrence: " + occurrence("aaabbbbaaad", 'a'));
        System.out.println("It is equals: " + contains("Daniel","daniel"));
        System.out.println("It is not equal: " + contains("Daniel","dawid"));
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static String concatenate(String a, String b) {
        return a + b;
    }
    public static int multiply2(int a, int b, int c, int d) {
        return (a * b) + (c * d);
    }
    public static int power(int potega, int wykładnik) {
        return (int) Math.pow(potega, wykładnik);
    }
    public static int occurrence(String a, char b) {
        int totals = 0;
        for (int i = 0; i <= a.length() - 1; i++) {
            if (a.charAt(i) == b)
                totals++;
        }
        return totals;
    }
    public static boolean contains(String a, String b){
        if (a.equalsIgnoreCase(b))
        return true;
        return false;
    }
}
/*
Metody
1. Napisz metodę multiply, która przyjmie dwa parametry typu int, a która zwróci wynik mnożenia tych parametrów.
2. Napisz metodę concatenate, która przyjmie dwa łańcuchy znaków jako parametry, a która zwróci ich konkatenację.
3. Napisz metodę multiply2, która zadziała tak jak w metoda multiply z zadania 1., ale wynik policzy z wykorzystaniem
wielokrotnego dodawania.
4. Napisz metodę power, która przyjmie dwa parametry typu int, a która zwróci wynik potęgowania o podstawie i wykładniku
takich, jak przekazano.
5. Napisz metodę, która przyjmie jako pierwszy parametr wartość typu String, a jako drugi znak. Metoda zwróci liczbę
wystąpień znaku w łańcuchu.
6. Napisz metodę contains, która przyjmuje dwa łańcuchy jako parametry, a która zwraca informację, czy pierwszy łańcuch
zawiera drugi.
 */