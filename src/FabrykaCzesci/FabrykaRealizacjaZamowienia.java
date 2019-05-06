package FabrykaCzesci;

public class FabrykaRealizacjaZamowienia {

    public Cześć wydajCześći(String model){

        Cześć cześć = produkujCześć(model);
        System.out.println("");
        cześć.produkcjaCześći();
        cześć.testowanieCześći();
        cześć.sprzedawanieCześći();
        cześć.pakowanieCześći();
        cześć.cześćiGotoweDoWysłania();
        return cześć;
    }

    protected Cześć produkujCześć(String model){

        Cześć cześć = null;

        if (model.equalsIgnoreCase("CIEZAROWE")){
            cześć = new CześćiCieżarowe(new FabrykaCzesciAutCieżarowych());

        }else if(model.equalsIgnoreCase("MOTOROWE")){
            cześć = new CześćiMotorowe(new FabrykaCzesciMotorow());

        }else if(model.equalsIgnoreCase("TERENOWE")){
            cześć = new CześćiTerenowe(new FabrykaCzesciAutTerenowych());

        }else if(model.equalsIgnoreCase("OSOBOWE")) {
            cześć = new CześćiOsobowe(new FabrykaCzesciAutOsobowych());
       }
       return cześć;
    }
}
