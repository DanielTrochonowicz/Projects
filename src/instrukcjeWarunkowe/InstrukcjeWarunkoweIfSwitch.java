package instrukcjeWarunkowe;

public class InstrukcjeWarunkoweIfSwitch {
    public static void main(String[] args) {

        int x = 9;

        if (x == 4){
            System.out.println("X = 4");
        }else if (x == 6){
            System.out.println("X = 6");
        }else if (x == 7){
            System.out.println("X = 7");
        }else if (x == 3){
            System.out.println("X = 3");
        }else if (x == 1){
            System.out.println("X = 1");
        }else if (x == 9){
            System.out.println("X = 9");
        }else {
            System.out.println("X nie ma żądanej wartości");
        }
        System.out.println("Koniec.");


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
        }
        System.out.println("Koniec.");
    }
}
