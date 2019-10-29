package fabrykaCzesci;

import fabrykaCzesci.SkrzyniaBiegów;

public class SkrzyniaBiegówDoAutTerenowych implements SkrzyniaBiegów {

    String name = "Skrzynia Biegów Do Aut Terenowych.";

    public SkrzyniaBiegów wydajSkrzyniaBiegów(){
        System.out.println("Cześć wysłana do produkcji: " + name);
        return new SkrzyniaBiegówDoAutTerenowych();
    }
}

