package fabrykaCzesci;

public class ZawieszenieTyłDoAutTerenowych implements ZawieszenieTył {

    String name = "Zawieszenie Tył Do Aut Terenowych.";

    public ZawieszenieTył wydajZawieszenieTył(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new ZawieszenieTyłDoAutTerenowych();
    }
}
