package fabrykaCzesci;

public class KlimatyzacjaDoAutTerenowych implements Klimatyzacja {

    String name = "Klimatyzacja Do Aut Terenowych.";

    public Klimatyzacja wydajKlimatyzacje(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new KlimatyzacjaDoAutTerenowych();
    }
}
