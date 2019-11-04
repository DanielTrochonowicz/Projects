package obserwatorPattern;

public class CzytnikTemperatury {

    private int nrKolejny;

    public CzytnikTemperatury(int nrKolejny){
        this.nrKolejny = nrKolejny;
    }

    public void update(int temperatura){
        System.out.println("Czytnik nr: " + nrKolejny + " odczytał nową temperaturę: " + temperatura + " Stopni.");
    }
}
