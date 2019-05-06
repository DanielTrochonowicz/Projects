package FabrykaCzesci;

public class UkładWydechowyDoAutCieżarowych implements UkładWydechowy {

    String name = "Układ Wydechowy Do Aut Cieżarowych.";

    public UkładWydechowy wydajUkładWydechowy(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new UkładWydechowyDoAutCieżarowych();
    }
}
