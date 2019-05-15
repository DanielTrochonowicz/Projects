package Task;

import java.util.Arrays;

public class Lock {
    public static void main(String[] args) {


        GeneratorKodu zamekDoRoweru = new GeneratorKodu(1, 2, 3);
//        int aktualna = zamekDoRoweru.aktualnaUstawionaKombinacjaZamka(1,2,3);
//        boolean sprawdzam = zamekDoRoweru.equals(aktualna);
//        int sprawdzam1 = zamekDoRoweru.sprawdzamCzyZamekJestOtwartyCzyNie(1,3,4);
//        int przesun = zamekDoRoweru.przesunOJednaPozycjeWPrawo(3,5);




    }

    static class GeneratorKodu implements PoprawnaKombinacja{
        private final int pierwszaCyfra;
        private final int drugaCyfra;
        private final int trzeciaCyfra;

        public GeneratorKodu(int pierwszaCyfra, int drugaCyfra, int trzeciaCyfra) {
            this.pierwszaCyfra = pierwszaCyfra;
            this.drugaCyfra = drugaCyfra;
            this.trzeciaCyfra = trzeciaCyfra;
        }

        public int aktualnaUstawionaKombinacjaZamka(int pierwszaCyfra, int drugaCyfra, int trzeciaCyfra) {

            return aktualnaUstawionaKombinacjaZamka(pierwszaCyfra, drugaCyfra, trzeciaCyfra);
        }
        public int przesunOJednaPozycjeWPrawo(int a, int b) {

            return a >> b;
        }

        public int sprawdzamCzyZamekJestOtwartyCzyNie(int pierwszaCyfra, int drugaCyfra, int trzeciaCyfra) {

            return sprawdzamCzyZamekJestOtwartyCzyNie(pierwszaCyfra, drugaCyfra, trzeciaCyfra);
        }

        @Override
        public void AktualnaKombinacjaZamka() {
            System.out.println(aktualnaUstawionaKombinacjaZamka(pierwszaCyfra,drugaCyfra,trzeciaCyfra));
        }

        @Override
        public void PrzesunWybranaPrzekładnie() {

            System.out.println(przesunOJednaPozycjeWPrawo(pierwszaCyfra,drugaCyfra));
        }

        @Override
        public void Otwarty() {
            System.out.println(sprawdzamCzyZamekJestOtwartyCzyNie(pierwszaCyfra,drugaCyfra,trzeciaCyfra));
        }
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


