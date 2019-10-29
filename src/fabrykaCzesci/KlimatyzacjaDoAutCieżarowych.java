package fabrykaCzesci;

public class KlimatyzacjaDoAutCieżarowych implements Klimatyzacja {

    String name = "Klimatyzacja Do Aut Cieżarowych.";

    public Klimatyzacja wydajKlimatyzacje(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new KlimatyzacjaDoAutCieżarowych();
    }
}
