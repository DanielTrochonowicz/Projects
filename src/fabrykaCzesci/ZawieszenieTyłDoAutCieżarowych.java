package fabrykaCzesci;

public class ZawieszenieTyłDoAutCieżarowych implements ZawieszenieTył {

    String name = "Zawieszenie Tył Do Aut Cieżarowych.";

    public ZawieszenieTył wydajZawieszenieTył(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new ZawieszenieTyłDoAutCieżarowych();
    }
}
