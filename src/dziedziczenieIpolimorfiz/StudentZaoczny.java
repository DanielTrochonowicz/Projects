package dziedziczenieIpolimorfiz;

public class StudentZaoczny extends Student{


    @Override
    public String toString() {
        return "Student Zaoczny: " + '\n' +
                "Imie: " + imie + '\n' +
                "Nazwisko: " + nazwisko ;
    }
}
