package FabrykaCzesci;

public class CześćiTerenowe extends Cześć {

    FabrykaCześćiSamochodowychIMotorow fabrykaCześćiSamochodowychIMotorow;

    public CześćiTerenowe(FabrykaCześćiSamochodowychIMotorow osobowe){
        fabrykaCześćiSamochodowychIMotorow = osobowe;
        produkcja();
    }
    public void produkcja(){

        klimatyzacja = fabrykaCześćiSamochodowychIMotorow.produkujKlimatyzacje().wydajKlimatyzacje();
        koła = fabrykaCześćiSamochodowychIMotorow.produkujemyKoła().wydajKoła();
        ramaZawieszenia = fabrykaCześćiSamochodowychIMotorow.produkujRameZawieszenia().wydajRameZawieszenia();
        silnik = fabrykaCześćiSamochodowychIMotorow.produkujemySilnik().wydajSilnik();
        skrzyniaBiegów = fabrykaCześćiSamochodowychIMotorow.produkujemySkrzyniaBiegów().wydajSkrzyniaBiegów();
        szyby = fabrykaCześćiSamochodowychIMotorow.produkujemySzyby().wydajSzyby();
        układNapedowy = fabrykaCześćiSamochodowychIMotorow.produkujemyUkładNapedowy().wydajUkładNapedowy();
        układWydechowy = fabrykaCześćiSamochodowychIMotorow.produkujemyUkładWydechowy().wydajUkładWydechowy();
        zawieszeniePrzód = fabrykaCześćiSamochodowychIMotorow.produkujemyZawieszeniePrzód().wydajZawieszeniePrzód();
        zawieszenieTył = fabrykaCześćiSamochodowychIMotorow.produkujemyZawieszenieTył().wydajZawieszenieTył();
    }
}

