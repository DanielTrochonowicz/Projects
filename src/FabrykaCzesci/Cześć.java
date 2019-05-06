package FabrykaCzesci;

abstract class Cześć {

    Klimatyzacja klimatyzacja;
    Koła koła;
    RamaZawieszenia ramaZawieszenia;
    Silnik silnik;
    SkrzyniaBiegów skrzyniaBiegów;
    Szyby szyby;
    UkładNapedowy układNapedowy;
    UkładWydechowy układWydechowy;
    ZawieszeniePrzód zawieszeniePrzód;
    ZawieszenieTył zawieszenieTył;

    public abstract void produkcja();

    public void produkcjaCześći(){
        System.out.println("Produkje zamówione cześći. Zamowienie w toku!!!");
    }

    public void testowanieCześći(){
        System.out.println("Testowanie cześći wyprodukowanych i przygotowanych do sprzedaży!!!");
    }

    public void sprzedawanieCześći(){
        System.out.println("Sprzedaje cześći!!!");
    }

    public void pakowanieCześći(){
        System.out.println("Pakowanie cześći!!!");
    }

    public void cześćiGotoweDoWysłania(){
        System.out.println("Cześći Gotowe Do Wysłania!!!");
    }
}
