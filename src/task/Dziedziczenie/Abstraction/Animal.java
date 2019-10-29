package Task.Dziedziczenie.Abstraction;

public abstract class Animal implements Product{
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.makeASound();
        System.out.println("Price: " + dog.getPrice()+ "$.");
        System.out.println("Weight: " + dog.getWeight()+ "Kg.");

        Mouse mouse = new Mouse();
        mouse.makeASound();
        System.out.println("Price: " + mouse.getPrice()+ "$.");
        System.out.println("Weight: " + mouse.getWeight()+ "Kg.");

        Cat cat = new Cat();
        mouse.makeASound();
        System.out.println("Price: " + cat.getPrice()+ "$.");
        System.out.println("Weight: " + cat.getWeight()+ "Kg.");
    }
    public void makeASound() {
        System.out.println("Sold");
    }
}
/*
1. Stwórz interfejs Product (produkt w sklepie) z metodami:
int getPrice();
int getWeight();
2. Stwórz klasę ChocolateBar, która będzie reprezentowała batonik.
   Batonik ma pola cena i waga.
   Niech batonik będzie produktem (implementuje interfejs Product).
 */