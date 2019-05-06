package FabrykaCzesci;

public class CześćiMotorowe extends Cześć {

    FabrykaCzesciMotorow fabrykaCzesciMotorow;

    public CześćiMotorowe(FabrykaCzesciMotorow fabrykaCzesciMotorow){
        this.fabrykaCzesciMotorow = fabrykaCzesciMotorow;
        produkcja();
    }
    public void produkcja(){

        koła = fabrykaCzesciMotorow.produkujemyKoła().wydajKoła();
        ramaZawieszenia = fabrykaCzesciMotorow.produkujRameZawieszenia().wydajRameZawieszenia();
        silnik = fabrykaCzesciMotorow.produkujemySilnik().wydajSilnik();
        skrzyniaBiegów = fabrykaCzesciMotorow.produkujemySkrzyniaBiegów().wydajSkrzyniaBiegów();
        układNapedowy = fabrykaCzesciMotorow.produkujemyUkładNapedowy().wydajUkładNapedowy();
        układWydechowy = fabrykaCzesciMotorow.produkujemyUkładWydechowy().wydajUkładWydechowy();
        zawieszeniePrzód = fabrykaCzesciMotorow.produkujemyZawieszeniePrzód().wydajZawieszeniePrzód();
        zawieszenieTył = fabrykaCzesciMotorow.produkujemyZawieszenieTył().wydajZawieszenieTył();
    }
}
