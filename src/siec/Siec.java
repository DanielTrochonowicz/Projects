package siec;

import java.net.InetAddress;

public class Siec {

    public static void main(String[] args) throws Exception {

        InetAddress adres = InetAddress.getLocalHost();
        System.out.println(adres);

        adres = InetAddress.getByName("onet.pl");
        System.out.println(adres);

        InetAddress adresy[] = InetAddress.getAllByName("amazon.com");
        for (int x = 0; x < adresy.length; x++) {
            System.out.println(adresy[x]);
        }
        adres = InetAddress.getLoopbackAddress();
        System.out.println(adres);
    }
}
