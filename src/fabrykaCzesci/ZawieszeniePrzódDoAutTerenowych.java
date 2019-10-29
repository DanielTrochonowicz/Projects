package fabrykaCzesci;

public class ZawieszeniePrzódDoAutTerenowych implements ZawieszeniePrzód {

    String name = "Zawieszenie Przód Do Aut Terenowych.";

    public ZawieszeniePrzód wydajZawieszeniePrzód(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new ZawieszeniePrzódDoAutTerenowych();
    }
}
