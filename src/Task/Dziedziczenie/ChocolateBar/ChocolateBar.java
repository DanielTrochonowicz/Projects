package Task.Dziedziczenie.ChocolateBar;

import java.util.Arrays;

public abstract class ChocolateBar  {
    public static void main(String[] args) {

        CerealBar cerealBar = new CerealBar();
        String bar = cerealBar.bar("Mars");
        int price = cerealBar.price(5);
        int weight = cerealBar.weight(50);
        System.out.println(cerealBar.getPrice());
        System.out.println(cerealBar.getWeight());

        System.out.println("Bar: " + bar);
        System.out.println("Price: " + price);

        Mleko milk = new Mleko();
        milk.getPrice();
        milk.getWeight();
        double areaMilk  = milk.getArea(2.0);

        System.out.println("Price: " + milk.getPrice());
        System.out.println("Weight: " + milk.getWeight());
        System.out.println("Area milk: " + areaMilk);


    }
}

/*
1. Stwórz interfejs Product (produkt w sklepie) z metodami:
   int getPrice();
   int getWeight();
2. Stwórz klasę ChocolateBar, która będzie reprezentowała batonik.
   Batonik ma pola cena i waga. Niech batonik będzie
   produktem (implementuje interfejs Product).
 */