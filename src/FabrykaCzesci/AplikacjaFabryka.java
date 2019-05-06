package FabrykaCzesci;

public class AplikacjaFabryka {

    public static void main(String[] args) {

        FabrykaRealizacjaZamowienia fabrykaRealizacjaZamowienia = new FabrykaRealizacjaZamowienia();

        System.out.println("\nCIEZAROWE\n");
        Cześć cieżarowe = fabrykaRealizacjaZamowienia.wydajCześći("CIEZAROWE");

        System.out.println("\nMOTOROWE\n");
        Cześć motorowe = fabrykaRealizacjaZamowienia.wydajCześći("MOTOROWE");

        System.out.println("\nTERENOWE\n");
        Cześć terenowe = fabrykaRealizacjaZamowienia.wydajCześći("TERENOWE");

        System.out.println("\nOSOBOWE\n");
        Cześć osobowe = fabrykaRealizacjaZamowienia.wydajCześći("OSOBOWE");
    }
}
