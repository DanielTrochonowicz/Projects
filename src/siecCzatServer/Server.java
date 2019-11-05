package siecCzatServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class Server {

    ArrayList klientArrayList;
    PrintWriter printWriter;

    //uruchomienie programu
    public static void main(String[] args) {

        Server s = new Server();
        s.startSerwer();


    }

    //start serwera
    public void startSerwer(){

        klientArrayList = new ArrayList();
        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("Słucham: " + serverSocket);
                printWriter = new PrintWriter(socket.getOutputStream());
                klientArrayList.add(printWriter);

                Thread t = new Thread(new SerwerKlient(socket));
                t.start();
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    //klasa wewnetrzna
    class SerwerKlient implements Runnable{

        Socket socket;
        BufferedReader bufferedReader;

        //konstruktor
        public SerwerKlient(Socket socketKlient){
            try{
                System.out.println("Połączony");
                socket = socketKlient;
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        @Override
        public void run() {
            String str;
            PrintWriter pw = null;

            try {
                while ((str = bufferedReader.readLine()) != null){
                    System.out.println("Odebrano >> ");

                    Iterator it = klientArrayList.iterator();

                    while (it.hasNext()){
                        pw = (PrintWriter) it.next();
                        pw.println(str);
                        pw.flush();
                    }
                }
            }catch (Exception ex){
            }
        }
    }
}
