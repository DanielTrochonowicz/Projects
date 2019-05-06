package FabrykaCzesci;

public class UkładNapedowyDoAutOsobowych implements UkładNapedowy {

    String name = "Układ Napedowy Do Aut Osobowych.";

    public UkładNapedowy wydajUkładNapedowy(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new UkładNapedowyDoAutOsobowych();
    }
}
