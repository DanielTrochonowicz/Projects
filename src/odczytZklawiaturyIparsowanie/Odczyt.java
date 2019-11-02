package odczytZklawiaturyIparsowanie;

import java.util.Scanner;

public class Odczyt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str;

        System.out.println("Wpisz cos: ");

        str = scanner.nextLine();

        System.out.println("Wpisałeś: " + str);


    }
}
