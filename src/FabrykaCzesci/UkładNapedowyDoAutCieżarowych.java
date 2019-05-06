package FabrykaCzesci;

public class UkładNapedowyDoAutCieżarowych implements UkładNapedowy {

    String name = "Układ Napedowy Do Aut Cieżarowych";

    public UkładNapedowy wydajUkładNapedowy(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new UkładNapedowyDoAutCieżarowych();
    }
}
