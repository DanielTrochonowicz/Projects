package Task;

public class _02_WriteNumbers {

    public static void main(String[] args) {

        for (int i = 5; i < 100; i++) {
            System.out.println("Numbers from 5 to 100: " + i);
        }


        for (int i = 55; i < 100; i++) {
            System.out.println("Numbers from 55 to 100: " + i);
        }


        for (int i = 100; i >= 0; i--) {
            System.out.println("First way Numbers written from 100 to 0: " + i);
        }
        for (int i = 0; i < 100; i = i + 2) {
            System.out.println("Second way Numbers written from 100 to 0: " + i);
        }


        for (int i = 0; i < 100; i++){
            if (i % 2 == 0) {
                System.out.println("Even numbers: " + i) ;
            }
        }


        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number 100 divisible by 2,3,5: " + i);
            }
        }


        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Number 100 divisible by 2: " + i);
            }


        }for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Number 100 divisible by 3: " + i);
            }


        }for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println("Number 100 divisible by 5: " + i);
            }
        }


        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("Number 100 divisible by 2,5: " + i);
            }
        }


        int sum = 0;
        for (int i = 1; i <= 459; i++) {
            sum += i;
        }
                System.out.println("The sum of numbers from 1 to 459: " + sum);



        int first = 5;
        int suma = 0;
        for (int i = 0; i < 459 ; i++) {
            suma =+ first;
            System.out.println(i + "Element ciągu: " + first + "Suma elementów: " + suma);
            first += 2;
        }
    }
}


/*
For:
1. Wypisz wszystkie liczby z zakresu 5 - 100.
2. Wypisz wszystkie liczby z zakresu 55 - 150.
3. Wypisz wszystkie liczby z zakresu 1 - 100 zaczynając od 100.
4. Wypisz wszystkie liczby parzyste z przedziału 0 - 100.
5. Dla liczb z przedziału 0 - 100 podaj informację,
   czy są podzielne przez 2, 3 i 5, w następujący sposób: 0,podzielne przez 2, podzielne przez 3, podzielne przez 5

1. podzielne przez 2
2. podzielne przez 3
3. podzielne przez 5
4. podzielne przez 2, podzielne przez 3
5. podzielne przez 2
6. podzielne przez 3
6. podzielne przez 2, podzielne przez 5
...
7. Podaj sumę wszystkich liczb z przedziału 1 - 459 (skorzystaj z pętli for).
8. Podaj wartość sumy wyrazów ciągu arytmetycznego.
   Wartość pierwszego wyrazu ciagu to 5, różnica każdych kolejnych
   dwóch wyrazów to 2. Chcemy zsumować 459 wyrazów (skorzystaj z pętli for).
 */




