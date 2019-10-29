package fabrykaCzesci;

public class CześćiCieżarowe extends Cześć {

    FabrykaCzesciAutCieżarowych fabrykaCzesciAutCieżarowych;

    public CześćiCieżarowe(FabrykaCzesciAutCieżarowych fabrykaCzesciAutCieżarowych) {
        this.fabrykaCzesciAutCieżarowych = fabrykaCzesciAutCieżarowych;
        produkcja();
    }

    public void produkcja() {

        klimatyzacja = fabrykaCzesciAutCieżarowych.produkujKlimatyzacje().wydajKlimatyzacje();
        koła = fabrykaCzesciAutCieżarowych.produkujemyKoła().wydajKoła();
        ramaZawieszenia = fabrykaCzesciAutCieżarowych.produkujRameZawieszenia().wydajRameZawieszenia();
        silnik = fabrykaCzesciAutCieżarowych.produkujemySilnik().wydajSilnik();
        skrzyniaBiegów = fabrykaCzesciAutCieżarowych.produkujemySkrzyniaBiegów().wydajSkrzyniaBiegów();
        szyby = fabrykaCzesciAutCieżarowych.produkujemySzyby().wydajSzyby();
        układNapedowy = fabrykaCzesciAutCieżarowych.produkujemyUkładNapedowy().wydajUkładNapedowy();
        układWydechowy = fabrykaCzesciAutCieżarowych.produkujemyUkładWydechowy().wydajUkładWydechowy();
        zawieszeniePrzód = fabrykaCzesciAutCieżarowych.produkujemyZawieszeniePrzód().wydajZawieszeniePrzód();
        zawieszenieTył = fabrykaCzesciAutCieżarowych.produkujemyZawieszenieTył().wydajZawieszenieTył();
    }
}
