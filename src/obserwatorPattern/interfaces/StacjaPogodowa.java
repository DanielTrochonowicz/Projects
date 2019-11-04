package obserwatorPattern.interfaces;

import obserwatorPattern.CzytnikTemperatury;

public interface StacjaPogodowa {

    void dodajOdbiorce(CzytnikTemperatury ct);
    void usunOdbiorce(CzytnikTemperatury ct);
    void powiadom();
}
