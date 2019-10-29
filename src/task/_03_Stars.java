package task;

public class _03_Stars {
    public static void main(String[] args) {


        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        System.out.println("-------------/////-------------");

        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        System.out.println("-------------/////-------------");

        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");

        StringBuilder builder = new StringBuilder();

        int dollars = 10;
        for (int i = 0; i < dollars; i++) {
            for (int j = 0; j < ((dollars -1) * 2) - (2 *i); j++) {
                builder.append(' ');
            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                builder.append("$").append(' ');
            }
            builder.append('\n');
        }
        System.out.println(builder);

        StringBuilder builder1 = new StringBuilder();
        int stars = 10;
        for (int i = stars; i >= 0; i--) {
            for (int j = 0; j <= ((stars - 0) * 2) - (2 * i); j++) {
                builder1.append(' ');
            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                builder1.append('*').append(' ');
            }
            builder1.append('\n');
        }
        System.out.println(builder1);
    }
}

/*
1. Wypisz w konsoli:
*
**
***
****
*****
Wierszy w takim formacie chcemy uzyskać tyle, ile wynosi wartość przypisana zmiennej x.

2. Wypisz w konsoli:
****
***
**
*
Analogicznie do 1. korzystając z wartości zmiennej x.

10. Podobnie jak poprzednie ale chcemy uzyskać trójkąt z kątem prostokątnym w górnym, prawym rogu:
*******
 *****
  ***
   *
*/