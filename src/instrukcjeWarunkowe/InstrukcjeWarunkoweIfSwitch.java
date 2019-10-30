package instrukcjeWarunkowe;

public class InstrukcjeWarunkoweIfSwitch {
    public static void main(String[] args) {

        int x = 9;

        if (x == 4) {
            System.out.println("X = 4");
        } else if (x == 6) {
            System.out.println("X = 6");
        } else if (x == 7) {
            System.out.println("X = 7");
        } else if (x == 3) {
            System.out.println("X = 3");
        } else if (x == 1) {
            System.out.println("X = 1");
        } else if (x == 9) {
            System.out.println("X = 9");
        } else {
            System.out.println("X nie ma żądanej wartości");
        }
        System.out.println("Koniec.");

        String imie = "Daniel";
        String imie3 = "Jan";

        if (imie.equals("Daniel")){
            System.out.println("Cześć " + imie);
        }
        String imie2 = "Kasia";
        if (imie2 != "Daniel"){
            System.out.println("Cześć " + imie2);
        }
        if (imie.equals("Daniel") && imie2.equals("Kasia")){
            System.out.println("Cześć " + imie + " " + "Cześć " + imie2);
        }
        if (imie.equals("Daniel") || imie3.equals("Kasia")){
            System.out.println("Cześć " + imie + " " + "Cześć " + imie3);
        }

        if ((imie.equals("Daniel") && imie2.equals("Kasia")) || imie.equals(null)){
            System.out.println("Wyswietl: " + " " + "Cześć " + imie + " " + "Cześć " + imie2);
        }

        int x1 = 6;

        switch (x1) {
            case 4:
                System.out.println("X = 4");
                break;
            case 5:
                System.out.println("X = 5");
                break;
            case 6:
                System.out.println("X = 6");
                break;
            case 7:
                System.out.println("X = 7");
                break;
            case 8:
                System.out.println("X = 8");
                break;
            default:
                System.out.println("X nie ma żądanej wartości");
                break;
        }
        System.out.println("Koniec.");


        int x2 = 5;
        switch (x2) {
            case 4:
                showNumber(x2);
                break;
            case 5:
                showNumber(x2);
                break;
            case 6:
                showNumber(x2);
                break;
            case 7:
                showNumber(x2);
                break;
            case 8:
                showNumber(x2);
                break;
            default:
                System.out.println("X nie ma żądanej wartości");
                break;
        }
        System.out.println("Koniec.");
    }

    public static void showNumber(int x) {
        System.out.println("X = " + x);
    }
}
