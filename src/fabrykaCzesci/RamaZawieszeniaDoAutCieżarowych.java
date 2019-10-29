package fabrykaCzesci;

import java.util.Random;

public class RamaZawieszeniaDoAutCieżarowych implements RamaZawieszenia {

    String name = "Rama Zawieszenia Do Aut Cieżarowych.";

    public RamaZawieszenia wydajRameZawieszenia(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new RamaZawieszeniaDoAutCieżarowych();
    }
}
