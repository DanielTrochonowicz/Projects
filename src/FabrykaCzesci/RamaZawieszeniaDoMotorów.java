package FabrykaCzesci;

public class RamaZawieszeniaDoMotorów implements RamaZawieszenia {

    String name = "Rama Do Motorow.";
    public RamaZawieszenia wydajRameZawieszenia(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new RamaZawieszeniaDoMotorów();
    }
}
