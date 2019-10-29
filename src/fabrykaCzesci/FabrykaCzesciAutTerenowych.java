package fabrykaCzesci;

public class FabrykaCzesciAutTerenowych implements FabrykaCześćiSamochodowychIMotorow {
    @Override
    public Silnik produkujemySilnik() {
        return new SilnikDoAutTerenowych();
    }

    @Override
    public SkrzyniaBiegów produkujemySkrzyniaBiegów() {
        return new SkrzyniaBiegówDoAutTerenowych();
    }

    @Override
    public UkładNapedowy produkujemyUkładNapedowy() {
        return new UkładNapedowyDoAutTerenowych();
    }

    @Override
    public ZawieszeniePrzód produkujemyZawieszeniePrzód() {
        return new ZawieszeniePrzódDoAutTerenowych();
    }

    @Override
    public ZawieszenieTył produkujemyZawieszenieTył() {
        return new ZawieszenieTyłDoAutTerenowych();
    }

    @Override
    public Klimatyzacja produkujKlimatyzacje() {
        return new KlimatyzacjaDoAutTerenowych();
    }

    @Override
    public RamaZawieszenia produkujRameZawieszenia() {
        return new RamaZawieszeniaDoAutTerenowych();
    }

    @Override
    public UkładWydechowy produkujemyUkładWydechowy() {
        return new UkładWydechowyDoAutTerenowych();
    }

    @Override
    public Szyby produkujemySzyby() {
        return new SzybyDoAutTerenowych();
    }

    @Override
    public Koła produkujemyKoła() {
        return new KołaDoAutTerenowych();
    }
}
