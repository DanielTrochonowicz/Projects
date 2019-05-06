package FabrykaCzesci;

public class ZawieszenieTyłDoMotorow implements ZawieszenieTył {

    String name = "Zawieszenie Tył Do Motorow";

    public ZawieszenieTył wydajZawieszenieTył(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new ZawieszenieTyłDoMotorow();
    }
}
