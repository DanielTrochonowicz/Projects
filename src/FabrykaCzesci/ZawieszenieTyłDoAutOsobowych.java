package FabrykaCzesci;

public class ZawieszenieTyłDoAutOsobowych implements ZawieszenieTył {

    String name = "Zawieszenie Tył Do Aut Osobowych";

    public ZawieszenieTył wydajZawieszenieTył(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new ZawieszenieTyłDoAutOsobowych();
    }
}
