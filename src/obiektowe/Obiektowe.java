package obiektowe;

public class Obiektowe {

    public static void main(String[] args) {

        Telefon telefon = new Telefon();
        telefon.setMarka("Samsung");
        telefon.setWielkosc(14);
        telefon.setCena(900.90);

        String marka = telefon.getMarka();
        int wielkość = telefon.getWielkosc();
        double cena = telefon.getCena();

//        telefon.marka = "Nokia";
//        telefon.wielkosc = 10;
//        telefon.cena = 500;
//
//        telefon.numberAdd();
//        telefon.numberDelete();
//        telefon.vloimeDown();
//        telefon.vloimeUp();

        Telefon telefon1 = new Telefon();

        telefon1.setMarka("Nokia");
        telefon1.setWielkosc(10);
        telefon1.setCena(500.63);

        String marka1 = telefon.getMarka();
        int wielkość1 = telefon.getWielkosc();
        double cena1 = telefon.getCena();

//        telefon1.marka = "Sony";
//        telefon1.wielkosc = 13;
//        telefon1.cena = 900;

//        System.out.println(telefon.marka);
//        System.out.println(telefon.wielkosc);
//
//        System.out.println(telefon1.marka);
//        System.out.println(telefon1.wielkosc);

        Telefon telefon3 = new Telefon("Sony", 8, 350);

        System.out.println(telefon3);

        System.out.println(telefon.getMarka());
        System.out.println(telefon.getWielkosc());
        System.out.println(telefon.getCena());

        System.out.println(marka);
        System.out.println(wielkość);
        System.out.println(cena);

        System.out.println(telefon1.getMarka());
        System.out.println(telefon1.getWielkosc());
        System.out.println(telefon1.getCena());

        System.out.println(marka1);
        System.out.println(wielkość1);
        System.out.println(cena1);
    }
}
