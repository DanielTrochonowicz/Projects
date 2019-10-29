package fabrykaCzesci;

public class KołaDoMotorów implements Koła {

    String name = "Koła Do Motorow.";
    public Koła wydajKoła(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new KołaDoMotorów();
    }
}
