package enumy;

public enum Samochody {

    OPEL_CORSA(1980, 2),
    FORD_FIESTA(2019, 4),
    VW_POLO(2015, 4),
    TOYOTA_AURIS(2018, 4);

    private int rok;
    private int iloscDrzwi;

    Samochody(int rok, int iloscDrzwi) {
        this.rok = rok;
        this.iloscDrzwi = iloscDrzwi;
    }

    @Override
    public String toString() {
        return super.toString() + " Rok: " + rok + " IloscDrzwi: " + iloscDrzwi;
    }

    public int getRok() {
        return rok;
    }

    public int getIloscDrzwi() {
        return iloscDrzwi;
    }
}
