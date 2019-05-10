package Task;

import java.util.Arrays;

public class _04_CharCharAt {
    public static void main(String[] args) {

        System.out.println(" ");

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        System.out.print("Alphabet: " + Arrays.toString(alphabet));

        System.out.println(" ");

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i);
        }
        System.out.println(" ");

        for (char i = 'A'; i <= 'Z'; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
        System.out.println(" ");

        for (int i = 'A'; i <= 'Z'; i++) {
            if (i % 2 == 0) {
                System.out.print(i);  //rzutowane na unicod  mozna sprawdzic wartosc w ASCII.pl
            }
        }
        System.out.println(" ");

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i);
        }
        System.out.println(" ");

        char max = 0;
        for (char i = 'A'; i < 'Z' + 1; i++) {
            if (i > max)
                max = i;
        }
        System.out.println("Max: " + max);

        System.out.println(" ");

        String text = "Daniel";
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(1));
        System.out.println(text.charAt(2));
        System.out.println(text.charAt(3));
        System.out.println(text.charAt(4));
        System.out.println(text.charAt(5));

        System.out.println(" ");

        String alf = "alfabet";
        int totals = 0;
        for (int i = 0; i <= alf.length() - 1; i++) {
            if (alf.charAt(i) == 'a')
                totals++;
        }
        System.out.println("Totals 'a': " + totals);


        System.out.println(" ");

        // Sprawdź, czy tekst jest palindromem (czy czytany od tyłu będzie taki sam).
        String txt = "kajak";  //jest palindromem
        //String txt = "Daniel"; // nie jest palindromem
        int j = 0;
        int k = (txt.length() - 1);
        for (int i = 0; i < txt.length(); i++) {

            if (txt.charAt(i) != txt.charAt(k)) {
                k = 1;
                break;
            }
            k--;
        }
        if (j < k)
            System.out.println("Is not a palindrome.");
        else {
            System.out.println("It is a palindrome.");
        }

        String texts = "aabbbccbb";
        int total = 0;
        for (int i = 0; i <= texts.length() - 1; i++) {
            if (texts.charAt(i) == 'a')
                total++;{
//                if ( texts.charAt(i) == 'b');
//                total++;
            }
        }
        System.out.println("Totals1 : " + total);

        System.out.println(" ");

        String first = "Daniel";
        String second = "Daniel";
        System.out.println("compare: " + first.equals(second));
        String first1 = "Daniel";
        String second1 = "daNieL";
        System.out.println("compare ignore case: " + first1.equalsIgnoreCase(second1));
        String first2 = "Dawid";
        String second2 = "Daniel";
        System.out.println("compare: " + first2.equals(second2));
    }
}




/*
char, charAt
1. Wypisz wszystkie litery angielskiego alfabetu.
2. Wypisz co drugi znak angielskiego alfabetu.
3. Wypisz znaki angielskiego alfabetu na wspak.
4. Znajdź największą literę w tekście "alfabet".
5. Zadeklaruj zmienną tekstową i przypisz jej wartość.
   Wypisz wszystkie znaki wartości tej zmiennej w osobnych wierszach.
6. Podaj liczbę wystąpień litery "a" w tekście "alfabet".
7. Sprawdź, czy tekst jest palindromem (czy czytany od tyłu będzie taki sam).
8. Sprawdź dla wybranego tekstu, dla której litery będziemy mieli najdłuższy ciąg
   wystąpień tylko tej litery. Przykładowo:
   aabbbccbb - dla tego tekstu będzie to b, które wystąpiło pod rząd 3 razy.
9. Zadeklaruj i przypisz wartości dwóm zmiennym tekstowym.
   Następnie sprawdź, czy pierwszy tekst zawiera drugi.
 */
