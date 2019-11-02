package wyjatki;

import java.util.Scanner;

public class Wyjatki {
    public static void main(String[] args) throws Exception {

        Wyjatki wyjatki = new Wyjatki();
        wyjatki.wczytajZnaki();
    }

    public void wczytajZnaki() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadż liczbę: ");

        String znaki = scanner.nextLine();

        if (znaki.length() == 0) {
            System.out.println(new MojwyjatekException("Pusty ciąg znaków!"));
            wczytajZnaki();
        }

        int x = 0;

        try {
            x = Integer.parseInt(znaki);
            System.out.println("Liczba: " + znaki);
        } catch (Exception ex) {
            System.out.println(new MojwyjatekException("To nie jest liczba!", ex));
            ex.printStackTrace();
            System.out.println("Bład!");
            wczytajZnaki();
        }
    }
}
