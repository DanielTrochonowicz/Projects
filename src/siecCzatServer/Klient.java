package siecCzatServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
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
            Socket socket = new Socket(IP, PORT);
            System.out.println("Podłączono do " + socket);

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));


            while (true){
                System.out.println(">> ");
                String srt = scanner.nextLine();
                if (srt.equalsIgnoreCase("q")){
                    printWriter.println(imie + ": " + srt);
                    printWriter.flush();
                }else {
                    printWriter.println(imie + " rozłączył się");
                    printWriter.flush();
                    printWriter.close();
                    scanner.close();
                    socket.close();
                }
            }
        }catch (Exception ex){

        }
    }
}