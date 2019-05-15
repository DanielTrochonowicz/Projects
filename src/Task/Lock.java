package Task;

import java.util.Arrays;

public class Lock {
    public static void main(String[] args) {



        GeneratorKodu  zamekDoRoweru = new GeneratorKodu(1,2,3);
        int aktualna = zamekDoRoweru.aktualnaUstawionaKombinacjaZamka();
        System.out.println(aktualna);

}
class GeneratorKodu {
    private final int pierwszaCyfra;
    private final int drugaCyfra;
    private final int trzeciaCyfra;

    public GeneratorKodu(int pierwszaCyfra, int drugaCyfra, int trzeciaCyfra) {
        this.pierwszaCyfra = pierwszaCyfra;
        this.drugaCyfra = drugaCyfra;
        this.trzeciaCyfra = trzeciaCyfra;
    }
    public void przesunOJednaPozycjeWPrawo(){
    }
    }
    public void sprawdzamCzyZamekJestOtwartyCzyNie(){
    }

    public int aktualnaUstawionaKombinacjaZamka(){
        return ;
    }
}
interface PoprawnaKombinacja {
     public void AktualnaKombinacjaZamka();
     public void PrzesunWybranaPrzekładnie();
     public void Otwarty();
}

/*
Stwórz typ Lock, reprezentujący zamek na kod (z trzema przekładniami - np. zamek do walizki/roweru). Będziemy mogli
tworzyć obiekt typu Lock przekazując jako parametr konstruktora trzy cyfry - kod otwierający zamek. Domyślnie obiekt
będzie tworzony z losowym ustawieniem przekładni. Obiekt typu Lock będzie oferował trzy metody zmieniający ustawienie
każdej z przekładni o jedną pozycję w prawo. Będzie również oferował metodę sprawdzającą, czy zamek jest otwarty, czy nie,
oraz metodę wypisującą na ekranie aktualnie ustawioną kombinację zamka.
9. Stwórz interfejs użytkownika dla zamka.
Kolejno:
- pytamy użytkownika w trzech krokach o poprawną kombinację
- nastepnie użytkownik może:
- sprawdzić aktualną kombinację zamka
- przesunąć wybraną przekładnię
- sprawdzić, czy zamek jest otwarty
 */


