package Task;

public class _06_Tables {
    public static void main(String[] args) {

        int[] tab = {1, 4, 5, 7, 8, 9, 0};
        print(tab);
        System.out.println(" ");
        getMax(tab);
        getMin(tab);
        getSum(tab);
        getMaxMinAndSum(tab);
        int[] tab1 = {5, 5, 5, 5};
        int[] tab2 = {5, 5, 5, 5, 5};
        getLager(tab1, tab2);
    }

    public static void print(int tab[]) {

        for (int i = 0; i < tab.length; i++) {
            System.out.print(" " + tab[i]);
        }
    }

    public static void getMax(int tab[]) {
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        System.out.println("Max: " + max);
    }

    public static void getMin(int tab[]) {
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min)
                min = tab[i];
        }
        System.out.println("Min: " + min);
    }

    public static void getSum(int tab[]) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        System.out.println("Sum: " + sum);
    }

    public static void getMaxMinAndSum(int tab[]) {
        int max1 = tab[0];
        int min1 = tab[0];
        int sum1 = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max1)
                max1 = tab[i];
            if (tab[i] < min1)
                min1 = tab[i];
            sum1 += tab[i];
        }
        System.out.println("Max: " + max1 + " Min: " + min1 + " Sum: " + sum1);
    }

    public static void getLager(int tab1[], int tab2[]) {
        int max1 = 0;
        for (int i = 0; i < tab1.length; i++) {
            max1 += tab1[i];
        }
        int max2 = 0;
        for (int j = 0; j < tab2.length; j++) {
            max2 += tab2[j];
        }
        System.out.println("Max tab1: " + max1);
        System.out.println("Max tab2: " + max2);

    }
}
