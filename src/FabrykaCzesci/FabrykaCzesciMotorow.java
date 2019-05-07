package FabrykaCzesci;

public class FabrykaCzesciMotorow implements FabrykaCześćiSamochodowychIMotorow {

    @Override
    public Silnik produkujemySilnik() {
        return new SilnikDoMotorow();
    }

    @Override
    public SkrzyniaBiegów produkujemySkrzyniaBiegów() {
        return new SkrzyniaBiegówDoMotorow();
    }

    @Override
    public UkładNapedowy produkujemyUkładNapedowy() {
        return new UkładNapedowyDoMotorow();
    }

    @Override
    public ZawieszeniePrzód produkujemyZawieszeniePrzód() {
        return new ZawieszeniePrzódDoMotorow();
    }

    @Override
    public ZawieszenieTył produkujemyZawieszenieTył() {
        return new ZawieszenieTyłDoMotorow();
    }

    @Override
    public Klimatyzacja produkujKlimatyzacje() { return null; }

    @Override
    public RamaZawieszenia produkujRameZawieszenia() {
        return new RamaZawieszeniaDoMotorów();
    }

    @Override
    public UkładWydechowy produkujemyUkładWydechowy() {
        return new UkładWydechowyDoMotorow();
    }

    @Override
    public Szyby produkujemySzyby() {
        return null;
    }

    @Override
    public Koła produkujemyKoła() {
        return new KołaDoMotorów();
    }
}
