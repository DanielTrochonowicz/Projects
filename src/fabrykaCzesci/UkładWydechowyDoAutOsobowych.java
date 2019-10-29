package fabrykaCzesci;

public class UkładWydechowyDoAutOsobowych implements UkładWydechowy {

    String name = "Układ Wydechowy Do Aut Osobowych.";

    public UkładWydechowy wydajUkładWydechowy(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new UkładWydechowyDoAutOsobowych();
    }
}
