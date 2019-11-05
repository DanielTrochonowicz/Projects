package siec;

import java.net.URL;

public class Siec2 {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://onet.pl/sport");

        System.out.println("Protokół: " + url.getProtocol());
        System.out.println("Komputer: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Plik: " + url.getFile());
        System.out.println("Całość: " + url.toExternalForm());
    }
}
