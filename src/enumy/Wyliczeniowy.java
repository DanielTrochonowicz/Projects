package enumy;

public class Wyliczeniowy {

    public static final String PON = "Poniedziałek";

    public static void main(String[] args) {

        System.out.println(PON);


        if(Samochody.FORD_FIESTA.getRok() == 1983){
            System.out.println("Stroche stary model");
        }
        int rok = Samochody.OPEL_CORSA.getRok();

        switch (Samochody.FORD_FIESTA.getRok()){
            case 1980:
                System.out.println("Troche stary");
                break;
            case 2019:
                System.out.println("Nowy model");
                break;
            case 2015:
                System.out.println("Jeszcze pojezdzi");
                break;
            case 2018:
                System.out.println("Roczny model");
                break;
        }
        System.out.println(rok);

        for (Samochody samochody : Samochody.values()) {
            System.out.println("Rok: " + samochody.getRok() + " " + "Ilosc drzwi: " + samochody.getIloscDrzwi());
        }

        Samochod samochod = new Samochod(Samochody.TOYOTA_AURIS.getRok(), Samochody.TOYOTA_AURIS.getIloscDrzwi());

        System.out.println(samochod.getRok());
        System.out.println(samochod.getDrzwi());

        System.out.println(samochod);

    }
}
