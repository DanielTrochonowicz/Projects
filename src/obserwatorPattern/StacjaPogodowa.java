package obserwatorPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class StacjaPogodowa implements obserwatorPattern.interfaces.StacjaPogodowa {

    ArrayList<CzytnikTemperatury> odbiorca;
    int temperatura;

    public StacjaPogodowa(int temperatura) {
        odbiorca = new ArrayList<>();
        this.temperatura = temperatura;
    }

    @Override
    public void dodajOdbiorce(CzytnikTemperatury ct) {
        odbiorca.add(ct);
    }

    @Override
    public void usunOdbiorce(CzytnikTemperatury ct) {
        odbiorca.remove(ct);
    }

    @Override
    public void powiadom() {
        Iterator<CzytnikTemperatury> it =odbiorca.iterator();
        while (it.hasNext()){
            CzytnikTemperatury ct = it.next();
            ct.update(temperatura);
        }
    }

    public void setTemperatura(int nowaTemperatura){
        System.out.println("Nowa Wartość: " + nowaTemperatura);
        temperatura = nowaTemperatura;
        powiadom();
    }
}
