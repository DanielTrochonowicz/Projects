package obserwatorPattern;

import java.util.Scanner;

public class WzorzecObserver {
    public static void main(String[] args) {

        StacjaPogodowa sp = new StacjaPogodowa(24);

        CzytnikTemperatury ct1 = new CzytnikTemperatury(1);
        sp.dodajOdbiorce(ct1);
        sp.setTemperatura(27);

        CzytnikTemperatury ct2 = new CzytnikTemperatury(1);
        sp.dodajOdbiorce(ct2);
        sp.setTemperatura(27);
        sp.setTemperatura(29);

        sp.usunOdbiorce(ct1);
        sp.setTemperatura(29);

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        sp.setTemperatura(x);
        main(null);




    }
}
