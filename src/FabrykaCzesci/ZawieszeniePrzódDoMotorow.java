package FabrykaCzesci;

public class ZawieszeniePrzódDoMotorow implements ZawieszeniePrzód{

    String name = "Zawieszenie Przód Do Motorow";

    public ZawieszeniePrzód wydajZawieszeniePrzód(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new ZawieszeniePrzódDoMotorow();
    }
}
