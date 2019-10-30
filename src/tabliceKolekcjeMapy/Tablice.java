package tabliceKolekcjeMapy;

public class Tablice {
    public static void main(String[] args) {

        int x1 = 0;
        int y1 = 0;

        int tab01[] = new int[5];

        tab01[0] = 1;
        tab01[1] = 2;
        tab01[2] = 3;
        tab01[3] = 4;
        tab01[4] = 5;

        int tab02[] = {5, 6, 7, 8, 9, 10};

        char tab03[] = new char[5];
        tab03[0] = 'a';

        char tab04[] = {'a', 'b', 'c', 'd', 'e'};

        String tab05[] = new String[5];

        String tab06[] = {"jeden", "dwa", "trzy", "cztery", "piec"};

        for (int x = 0; x < tab06.length; x++) {
            System.out.println(x + " : " + tab06[x]);
        }

        while (x1 < tab01.length){
            System.out.println(x1 + " : " + tab01[x1]);
            x1++;
        }

        do{
            System.out.println(y1 + " : " + tab01[y1]);
            y1++;
        }while (y1 < tab01.length);
    }
}
