package interfaceR;

public class Raporty extends Raport implements RaportyInterface {

    String tytuł;

    @Override
    public void pokaz(String str) {
        System.out.println("Raport " + str + " wyswietlany na ekranie");
    }

    @Override
    public void drukuj(String str) {
        System.out.println("Drukowanie raportu " + str);
    }

    @Override
    public void generujRaport(String str) {
        System.out.println("Przygotowwywanie raportu " + str);
    }

    @Override
    public String usunRaport(String str) {
        return "Raport " + str + " usuniety z systemu.";
    }
}
