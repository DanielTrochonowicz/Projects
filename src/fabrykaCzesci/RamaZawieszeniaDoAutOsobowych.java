package fabrykaCzesci;

public class RamaZawieszeniaDoAutOsobowych implements RamaZawieszenia {

    String name = "Rama Zawieszenia.";

    public RamaZawieszenia wydajRameZawieszenia(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new RamaZawieszeniaDoAutOsobowych();
    }
}
