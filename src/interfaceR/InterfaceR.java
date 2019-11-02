package interfaceR;

public class InterfaceR {
    public static void main(String[] args) {


        Raporty r = new Raporty();
        r.tytuł = " Raport01";

        r.generujRaport(r.tytuł);
        System.out.println(r.rapWygenrerowanyPrzez("Daniel"));

        r.pokaz(r.tytuł);
        r.drukuj(r.tytuł);

        System.out.println(r.usunRaport(r.tytuł));
    }
}
