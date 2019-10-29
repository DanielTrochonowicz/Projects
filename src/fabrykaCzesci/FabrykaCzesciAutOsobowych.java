package fabrykaCzesci;

public class FabrykaCzesciAutOsobowych implements FabrykaCześćiSamochodowychIMotorow {

    @Override
    public Silnik produkujemySilnik() {
        return new SilnikDoAutOsobowych();
    }

    @Override
    public SkrzyniaBiegów produkujemySkrzyniaBiegów() {
        return new SkrzyniaBiegówDoAutOsobowych();
    }

    @Override
    public UkładNapedowy produkujemyUkładNapedowy() {
        return new UkładNapedowyDoAutOsobowych();
    }

    @Override
    public ZawieszeniePrzód produkujemyZawieszeniePrzód() {
        return new ZawieszeniePrzódDoAutOsobowych();
    }

    @Override
    public ZawieszenieTył produkujemyZawieszenieTył() {
        return new ZawieszenieTyłDoAutOsobowych();
    }

    @Override
    public Klimatyzacja produkujKlimatyzacje() {
        return new KlimatyzacjaDoAutOsobowych();
    }

    @Override
    public RamaZawieszenia produkujRameZawieszenia() {
        return new RamaZawieszeniaDoAutOsobowych();
    }

    @Override
    public UkładWydechowy produkujemyUkładWydechowy() {
        return new UkładWydechowyDoAutOsobowych();
    }

    @Override
    public Szyby produkujemySzyby() {
        return new SzybyDoAutOsobowych();
    }

    @Override
    public Koła produkujemyKoła() {
        return new KołaDoAutOsobowych();
    }
}