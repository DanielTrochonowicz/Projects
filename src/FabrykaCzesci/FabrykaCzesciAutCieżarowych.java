package FabrykaCzesci;

public class FabrykaCzesciAutCieżarowych implements FabrykaCześćiSamochodowychIMotorow {
    @Override
    public Silnik produkujemySilnik() {
        return new SilnikDoAutCieżarowych();
    }

    @Override
    public SkrzyniaBiegów produkujemySkrzyniaBiegów() {
        return new SkrzyniaBiegówDoAutCieżarowych();
    }

    @Override
    public UkładNapedowy produkujemyUkładNapedowy() {
        return new UkładNapedowyDoAutCieżarowych();
    }

    @Override
    public ZawieszeniePrzód produkujemyZawieszeniePrzód() {
        return new ZawieszeniePrzódDoAutCieżarowych();
    }

    @Override
    public ZawieszenieTył produkujemyZawieszenieTył() {
        return new ZawieszenieTyłDoAutCieżarowych();
    }

    @Override
    public Klimatyzacja produkujKlimatyzacje() {
        return new KlimatyzacjaDoAutCieżarowych();
    }

    @Override
    public RamaZawieszenia produkujRameZawieszenia() {
        return new RamaZawieszeniaDoAutCieżarowych();
    }

    @Override
    public UkładWydechowy produkujemyUkładWydechowy() {
        return new UkładWydechowyDoAutCieżarowych();
    }

    @Override
    public Szyby produkujemySzyby() {
        return new SzybyDoAutCiezarowych();
    }

    @Override
    public Koła produkujemyKoła() {
        return new KołaDoAutCieżarowych();
    }
}
