package fasadaPattern;

import java.util.Scanner;

public class Bankomat {

    private BankomatFacade bankomatFacade = new BankomatFacade();
    private static Bankomat bankomat = new Bankomat();

    public static void main(String[] args) {
//        bankomat.bankomatStart();
        bankomat.bankWebStart();
    }

        public void bankomatStart () {

            int pin = 0;

            boolean autoryzacja = false;

            System.out.println("===== WITAJ W BANKOMACIE BANKU =====\n");
            System.out.println("=====  Włóż karte i podaj pin =====\n");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kod Pin: ");
            pin = scanner.nextInt();

            System.out.println("Autoryzacja...\n");

            autoryzacja = bankomatFacade.identyfikacja(1234567890, pin);
            if (autoryzacja) {
                bankomat.pokazMenu();
            } else {
                System.out.println("Autoryzacja nie powidła się. Karta została zatrzymana");
                bankomat.koniec();
            }
        }

    public void bankWebStart () {

        String id = "";
        int haslo = 0;

        boolean autoryzacja1 = false;

        System.out.println();
        System.out.println("===== WITAJ W BANKU =====\n");
        System.out.println("=====  Podaj id klienta i podaj Hasło =====\n");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Id klienta: ");
        id = scanner1.nextLine();
        System.out.println("Hasło: ");
        haslo = scanner1.nextInt();

        System.out.println("Autoryzacja...\n");

        autoryzacja1 = bankomatFacade.identyfikacjaWeb("Daniel", haslo);
        if (autoryzacja1) {
            bankomat.pokazMenuWeb();
        } else {
            System.out.println("Autoryzacja nie powidła się. Konto zostało zablokowane");
            bankomat.koniec();
        }
    }

    public void pokazMenu(){

        System.out.println("===== MENU =====");
        System.out.println("1. Stan konta");
        System.out.println("2. Wypłata gotówki");
        System.out.println("3. Wpłata gotówki");
        System.out.println("4. Koniec\n");

        System.out.println("Wybierz: ");

        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();

        switch (wybor){
            case 1:
                bankomat.pokazStanKonta(1234567890);
                break;
            case 2:
                bankomat.wyplacGotowke(260);
                break;
            case 3:
                bankomat.wplacGotowke(400);
                break;
            case 4:
                bankomat.koniec();
                break;
            case 5:
                bankomat.pokazMenu();
        }
    }

    public void pokazMenuWeb(){

        System.out.println("===== MENU =====");
        System.out.println("1. Stan konta");
        System.out.println("2. Aktywuj karte");
        System.out.println("3. Platnosc internetowa");
        System.out.println("4. Wykonaj przelew");
        System.out.println("5. Koniec\n");

        System.out.println("Wybierz: ");

        Scanner scanner = new Scanner(System.in);
        int wybor = scanner.nextInt();

        switch (wybor){
            case 1:
                bankomat.pokazStanKontaWeb(1234567890);
                break;
            case 2:
                bankomat.aktywujKarteWeb(1234567890);
                break;
            case 3:
                bankomat.platnoscInternetowa(999888777123213L, 450);
                break;
            case 4:
                bankomat.wykonajPrzelew(999888777123213L, 456354234123213L,450);
            case 5:
                bankomat.koniec();
                break;
            case 6:
                bankomat.pokazMenu();
        }
    }

    public void pokazStanKonta(long nrKarty){
        System.out.println(bankomatFacade.sprawdzStanKontaBankomat(nrKarty));
        bankomat.pokazMenu();
    }
    public  void wyplacGotowke(int kwota){
    String wyplata = bankomatFacade.wyplacGotowke(kwota);
        System.out.println(wyplata);
        System.out.println("Odbierz karte. ");
        bankomat.koniec();
    }

    public  void wplacGotowke(int kwota){
        String wplata = bankomatFacade.wplacGotowke(kwota);
        System.out.println(wplata);
        bankomat.pokazMenu();
    }

    public void koniec(){
        System.exit(0);
    }

    public void pokazStanKontaWeb(long nrKarty){
        System.out.println(bankomatFacade.sprawdzStanKontaWeb(nrKarty));
        bankomat.pokazMenuWeb();
    }

    public void  aktywujKarteWeb(long numerKarty){
        System.out.println(bankomatFacade.aktywujKarte(numerKarty));
        bankomat.pokazMenuWeb();
    }

    public void platnoscInternetowa(long zKontaMojego, float kwota){
        System.out.println(bankomatFacade.platnoscInternetowa(zKontaMojego, kwota));
        bankomat.pokazMenuWeb();
    }

    public void wykonajPrzelew(long zKonta, long naKonto, float kwota){
        System.out.println(bankomatFacade.wykonajPrzelew(zKonta, naKonto, kwota));
        bankomat.pokazMenuWeb();
    }
}