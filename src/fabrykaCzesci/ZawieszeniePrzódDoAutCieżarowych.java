package fabrykaCzesci;

public class ZawieszeniePrzódDoAutCieżarowych implements ZawieszeniePrzód {

    String name = "Zawieszenie Przód Do Aut Cieżarowych.";

    public ZawieszeniePrzód wydajZawieszeniePrzód(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new ZawieszeniePrzódDoAutCieżarowych();
    }
}
