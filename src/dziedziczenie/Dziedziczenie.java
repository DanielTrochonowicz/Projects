package dziedziczenie;

public class Dziedziczenie {
    public static void main(String[] args) {

        StudentDzienny sd = new StudentDzienny();

        sd.imie = "Daniel";
        sd.nazwisko = "kowalski";
        sd.obecnoscNaWykladzie();
        sd.komunikat();

        StudentZaoczny sz = new StudentZaoczny();
        sz.imie = "Kamil";
        sz.nazwisko = "kaminski";
        sz.obecnoscNaWykladzie();

        StudentOnline so = new StudentOnline();
        so.imie = " Kasia";
        so.nazwisko = "Milewicz";
        so.obecnoscNaWykladzie();

        StudentDziennyInny sdi = new StudentDziennyInny();
        sdi.imie = "Arek";
        sdi.nazwisko = "Kaminski";
        sdi.obecnoscNaWykladzie();
        sdi.komunikat();


        System.out.println(sd + "\n" + sz + "\n" + so);
    }

}
