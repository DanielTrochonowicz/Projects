package FabrykaCzesci;

public class CześćiOsobowe extends Cześć {

    FabrykaCzesciAutOsobowych fabrykaCzesciAutOsobowych;

    public CześćiOsobowe(FabrykaCzesciAutOsobowych fabrykaCzesciAutOsobowych){
        this.fabrykaCzesciAutOsobowych = fabrykaCzesciAutOsobowych;
        produkcja();
    }
    public void produkcja(){

        klimatyzacja = fabrykaCzesciAutOsobowych.produkujKlimatyzacje().wydajKlimatyzacje();
        koła = fabrykaCzesciAutOsobowych.produkujemyKoła().wydajKoła();
        ramaZawieszenia = fabrykaCzesciAutOsobowych.produkujRameZawieszenia().wydajRameZawieszenia();
        silnik = fabrykaCzesciAutOsobowych.produkujemySilnik().wydajSilnik();
        skrzyniaBiegów = fabrykaCzesciAutOsobowych.produkujemySkrzyniaBiegów().wydajSkrzyniaBiegów();
        szyby = fabrykaCzesciAutOsobowych.produkujemySzyby().wydajSzyby();
        układNapedowy = fabrykaCzesciAutOsobowych.produkujemyUkładNapedowy().wydajUkładNapedowy();
        układWydechowy = fabrykaCzesciAutOsobowych.produkujemyUkładWydechowy().wydajUkładWydechowy();
        zawieszeniePrzód = fabrykaCzesciAutOsobowych.produkujemyZawieszeniePrzód().wydajZawieszeniePrzód();
        zawieszenieTył = fabrykaCzesciAutOsobowych.produkujemyZawieszenieTył().wydajZawieszenieTył();
    }
}
