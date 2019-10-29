package fabrykaCzesci;

public class ZawieszeniePrzódDoAutOsobowych implements ZawieszeniePrzód {

    String name = "Zawieszenie Przód Do Aut Osobowych.";

    public ZawieszeniePrzód wydajZawieszeniePrzód(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new ZawieszeniePrzódDoAutOsobowych();
    }
}
