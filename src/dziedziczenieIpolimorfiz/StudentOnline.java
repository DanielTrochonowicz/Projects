package dziedziczenieIpolimorfiz;

public class StudentOnline extends Student {

    public void obecnoscNaWykladzie(){
        System.out.println("Jest obecny Online na wykładzie.");
    }

    @Override
    public String toString() {
        return "Student Online: " + '\n' +
                "Imie: " + imie + '\n' +
                "Nazwisko: " + nazwisko ;
    }
}
