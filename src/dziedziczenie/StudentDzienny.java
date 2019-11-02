package dziedziczenie;

public class StudentDzienny extends Student {

    public void komunikat(){
        System.out.println("...ale mi sie za bardzo nie chce.");
    }
    @Override
    public String toString() {
        return "Student Dzienny: " + '\n' +
                "Imie: " + imie + '\n' +
                "Nazwisko: " + nazwisko ;
    }

}
