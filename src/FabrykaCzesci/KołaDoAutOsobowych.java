package FabrykaCzesci;

public class KołaDoAutOsobowych implements Koła {

    String name = "Koła Do Aut Osobowych";

    public Koła wydajKoła(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new KołaDoAutOsobowych();
    }
}
