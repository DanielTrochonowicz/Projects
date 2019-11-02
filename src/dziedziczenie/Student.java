package dziedziczenie;

public class Student {

    String imie;
    String nazwisko;

    public void obecnoscNaWykladzie(){
        System.out.println("Jest obecny fizycznie na wykładzie.");
    }

    @Override
    public String toString() {
        return "Student: " + '\n' +
                "Imie: " + imie + '\n' +
                "Nazwisko: " + nazwisko ;
    }
}
