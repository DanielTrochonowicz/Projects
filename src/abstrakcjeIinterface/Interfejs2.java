package abstrakcjeIinterface;

public interface Interfejs2 {

    public void metoda3();

    public default void metoda4() {
        System.out.println("Metoda 4 z interfejsu");
    }

    //nalezy pamietac ze jak sie metode nadpisuje defoult w klasie to metoda nadpisana w klasie ma 1 i wyswietla sie z niej wszystko
    // co moze powodowac ze w interfejsie jak zdefiniujemy metode moze nam sie nie wyswietlic i moze byc maly problem dlatego nalezy
    // nalezy pamietac ze ma to duzy wplyw na kod i nie otrzymamy wtedy tego co chcemy z interfejsu juz zdefiniowanego
}
