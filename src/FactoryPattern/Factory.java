package FactoryPattern;

import java.util.Scanner;

public class Factory {
    public static void main(String[] args) {

        Factory factory = new Factory();
        System.out.print("Give model: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String marka = factory.getCars(str).getMarka();
        String klasa = factory.getCars(str).getClass().getName();

        System.out.println(marka);
        System.out.println(klasa);

    }

    public Cars getCars(String marka){
        Cars car;

        if (marka.equalsIgnoreCase("Porshe")){
            car = new Porshe();
        }else if (marka.equalsIgnoreCase("Nissan")){
            car = new Nissan();
        }else if (marka.equalsIgnoreCase("Mercedes")){
            car = new Mercedes();
        }else {
            car = new Cars();
        }
        return car;
    }
}
