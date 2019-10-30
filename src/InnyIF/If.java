package InnyIF;

public class If {
    public static void main(String[] args) {

        If innyIf = new If();

        int x = 1;

        if (x < 5) {
            System.out.println("True: x < 5");
        } else {
            System.out.println("False:  x > 5");
        }

        String str = ((x > 5) ? "True: x < 5" : "False:  x > 5");
        System.out.println(str);

        System.out.println((x < 5) ? "True: x < 5" : "False:  x > 5");

        System.out.println((x > 5) ? innyIf.metoda1() : innyIf.metoda2());

        String str2 = innyIf.metoda3((x < 5) ? "True: x < 5" : "False:  x > 5");
        System.out.println("Metoda 3: " + str2);

        System.out.println("Metoda 4: " + innyIf.metoda4(4));
        System.out.println("Metoda 4: " + innyIf.metoda4(8));

        String str3 = null;
        String nowyStr = (str3 != null) ? str3 : "Jest null : Java";
        System.out.println(nowyStr);

    }

    public String metoda1() {
        return "True: x < 5";
    }

    public String metoda2() {
        return "False:  x > 5";
    }

    public String metoda3(String str) {
        return str;
    }
    public String metoda4(int x){
        return (x < 5) ? "True: x < 5" : "False:  x > 5";
    }
}
