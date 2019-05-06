package FabrykaCzesci;

public class KołaDoAutTerenowych implements Koła {

    String name = "Koła Do Aut Terenowych";

    public Koła wydajKoła(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new KołaDoAutTerenowych();
    }
}
