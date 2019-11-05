package siecCzatServer;

import java.io.BufferedReader;
import java.util.Scanner;

public class Klient {

    public static final int PORT = 5000;
    public static final String IP = "127.0.0.1";

    BufferedReader bufferedReader;
    String imie;

    //Start programu
    public static void main(String[] args) {


    }

    //Uruchomienie klienta
    public  void startklienta(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imie: ");
        imie = scanner.nextLine();
        try {

        }catch (Exception ex){

        }
    }
}
