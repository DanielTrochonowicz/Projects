package fabrykaCzesci;

public class KołaDoAutCieżarowych implements Koła {

    String name = "Koła Do Aut Cieżarowych.";

    public Koła wydajKoła(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new KołaDoAutCieżarowych();
    }
}
