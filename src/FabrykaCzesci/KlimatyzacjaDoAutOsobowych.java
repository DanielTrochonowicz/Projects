package FabrykaCzesci;

public class KlimatyzacjaDoAutOsobowych implements Klimatyzacja{

    String name = "Klimatyzacja Do Aut Osobowych.";

    public Klimatyzacja wydajKlimatyzacje(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new KlimatyzacjaDoAutOsobowych();
    }
}