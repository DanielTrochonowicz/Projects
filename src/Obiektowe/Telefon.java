package Obiektowe;

public class Telefon {

    private String marka;
    private int wielkosc;
    private double cena;

    public Telefon(){

    }

    public Telefon(String marka, int wielkosc, double cena){
        this.marka = marka;
        this.wielkosc = wielkosc;
        this.cena = cena;
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getWielkosc() {
        return wielkosc;
    }

    public void setWielkosc(int wielkosc) {
        this.wielkosc = wielkosc;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void vloimeUp(){
        System.out.println("Volume Up");
    }

    public void vloimeDown(){
        System.out.println("Volume Down");
    }

    public void numberAdd(){
        System.out.println("Number Add");
    }

    public void numberDelete(){
        System.out.println("Number Delete");
    }

    @Override
    public String toString() {
        return "Marka Telefonu: " + marka + " " +
                "Wielkość Wyświetlacza: " + wielkosc + " " +
                "Cena: " + cena + " $";
    }
}
