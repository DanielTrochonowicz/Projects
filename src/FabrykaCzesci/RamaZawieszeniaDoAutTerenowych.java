package FabrykaCzesci;

public class RamaZawieszeniaDoAutTerenowych implements RamaZawieszenia {

    String name = "Rama Zawieszenia Do Aut Terenowych";

    public RamaZawieszenia wydajRameZawieszenia(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new RamaZawieszeniaDoAutTerenowych();
    }
}
