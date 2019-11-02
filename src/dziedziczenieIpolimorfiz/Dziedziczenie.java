package dziedziczenieIpolimorfiz;

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

//   System.out.println(sd + "\n" + sz + "\n" + so);

        System.out.println("=============== Polimorfiz ===============");

        Student [] studentTable = new Student[4];

        studentTable[0] = new StudentDzienny();
        studentTable[1] = new StudentDziennyInny();
        studentTable[2] = new StudentOnline();
        studentTable[3] = new StudentZaoczny();

        for (int x = 0; x <= studentTable.length -1; x++) {
            studentTable[x].obecnoscNaWykladzie();
        }
        Student s = new Student();
        Dziedziczenie.wezStudenta(s);

        ObsługaStudenta s1 = new ObsługaStudenta();
        StudentDzienny sd1 = new StudentDzienny();
        StudentOnline sto1 = new StudentOnline();

        s1.obsluz(sd1);
        s1.obsluz(sto1);
    }

    public static void  wezStudenta(Student s){
        s.obecnoscNaWykladzie();
    }
}

class ObsługaStudenta{
    public void obsluz(Student s){
        s.obecnoscNaWykladzie();
    }
}