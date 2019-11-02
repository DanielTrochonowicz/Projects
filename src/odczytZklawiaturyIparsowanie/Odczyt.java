package odczytZklawiaturyIparsowanie;

import java.util.Scanner;

public class Odczyt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str;

        System.out.println("Wpisz coś: ");

        str = scanner.nextLine();

        System.out.println("Wpisałeś: " + str);

//        try {
//            int x = Integer.parseInt(str);
//            System.out.println(x);
//        }catch (Exception e){
//            System.out.println("niepoprawna liczba");
//            main(null);
//        }
//
//        try {
//            System.out.println("Podaj liczbę: ");
//            int liczba = scanner.nextInt();
//            String str2 = String.valueOf(liczba);
//            System.out.println(str2);
//        }catch (Exception e){
//            System.out.println("Podaj liczbe całkowita");
//            main(null);
//        }
//
//        try {
//            System.out.println("Podaj liczbę: ");
//            String liczba1 = scanner.nextLine();
//            float str3 = Float.valueOf(liczba1);
//            System.out.println(str3);
//        }catch (Exception e){
//            System.out.println("Podaj liczbe float");
//            main(null);
//        }

        try {
            System.out.println("Podaj liczbę: ");
            String liczba2 = scanner.nextLine();
            double str4 = Double.valueOf(liczba2);
            String str5 = String.valueOf(str4);
            System.out.println(str4);
        }catch (Exception e){
            System.out.println("Podaj liczbe double");
            main(null);
        }


    }
}
