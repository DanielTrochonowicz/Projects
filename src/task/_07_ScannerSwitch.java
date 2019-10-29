package task;

import java.util.Scanner;

public class _07_ScannerSwitch {
    public static void main(String[] args) {
        //1.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide number: ");

        int number = scanner.nextInt();
        if (0 < number) {
            for (int i = 0; i < number; i++) {
                System.out.println("Natural numbers up to the set number: " + i);
            }
        }
        //2.
        System.out.println("Length of the sides of the rectangle: ");
        int lenght1 = scanner.nextInt();
        int lenght2 = scanner.nextInt();{
            System.out.println("Field of the rectangle: " + lenght1 * lenght2 + " Cm.");
        }
        //3.
        System.out.println("Calculate the field of the figure:\n" +
                " 1.Square.\n 2.Rectangle.\n 3.Circle.\n 4.Triangle.");
        int fild = scanner.nextInt();
        switch (fild) {
            case 1:
                int square1 = scanner.nextInt();
                System.out.println("Field of the Square: " + square1 * square1);
                break;
            case 2:
                int rectangle1 = scanner.nextInt();
                int rectangle2 = scanner.nextInt();
                System.out.println("Field of the Rectangle: " + rectangle1 * rectangle2);
                break;
            case 3:
                int circle1 = scanner.nextInt();
                System.out.println("Field of the Circle: " + Math.PI * Math.pow(circle1, 2));
                break;
            case 4:
                int triangle1 = scanner.nextInt();
                int triangle2 = scanner.nextInt();
                System.out.println("Field of the Triangle: " + triangle1 * triangle2 / 2);
                break;
        }
        //4.
        System.out.println("You want to enter the value of an integer: \n1.YES \n2.NO ");
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                int number1 = scanner.nextInt();
                System.out.println("Prime number: " + number1);
                break;
            case 2:
                System.out.println("EXIT.");
                break;
            default:
        }

        do{
            System.out.println("Do you want to finish operation of the program ? Yes/No ");
        }while(!scanner.nextLine().equalsIgnoreCase("yes"));
    }
}
/*
Scanner, switch
1. Stwórz program, który poprosi użytkownika o podanie wartości liczbowej.
Następnie program wypisze wszystkie liczby naturalne, aż do zadanej.
2. Stwórz program, który poprosi użytkownika o podanie dwóch wartości
- długości boków prostokąta. Następnie wypisze pole takiego prostokąta.
3. Stwórz program, który spyta użytkownika o podanie figury, której pole chce policzyć:
kwadratu, prostokąta, koła czy trójkąta. Następnie zgodnie z wyborem zada
odpowiednie pytania o wymiary figury i wypisze jej pole oraz obwód.
4. Stwórz program, który pyta użytkownika o wartość całkowitą i który daje
odpowiedź na pytanie, czy podano liczbę pierwszą.

While
1. Stwórz program, który będzie zadawał użytkownikowi pytanie "Czy chcesz zakończyć
   działanie programu", póki nie odpowie "tak". (google: java porównanie stringów/java String comparison)

2. Stwórz program, który poprosi użytkownika o podanie wartości liczbowej.
   Następnie sprawdzi, która potęga liczby 3 jest większa od zadanej wartości.
   Np. jeśli użytkownik podał 75, to odpowiedzią będzie
   4, bo 3 do czwartej potęgi jest równe 81 i to pierwsza potęga liczby 3 większa od 75.

3. Zapytaj użytkownika o liczbę całkowitą (kwotę). Następnie odpowiedz mu na pytanie,
   jaka kombinacja nominałów zajmie najmniej miejsca w portfelu. Np. dla 723 odpowiedzią jest:3 banknoty
   dwustuzłotowe, 1 banknot stuzłotowy, jeden dwudziestizłotowy,moneta dwuzłotowa oraz złotówka.
*/
