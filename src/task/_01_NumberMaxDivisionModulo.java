package task;

public class _01_NumberMaxDivisionModulo {

    public static void main(String[] args) {

        int[] number = new int[4];

        number[0] = 4;
        number[1] = 6;
        number[2] = 15;
        number[3] = 13;

        int max = number[0];

        for (int i = 0; i < number.length; i++)
            if (number[i] > max)
                max = number[i];
        System.out.println("Max numer: " + max);

        int division = max / 2;
        int modulo = max % 2;
        System.out.println("Division: " + division);
        System.out.println("The remainder: " + modulo);

        boolean comparison = max > 0 && max < 0 && max == 0 ;
        System.out.println("comparison:\n" + "Greater: " + comparison + "\n" + "Lower: " + comparison + "\n" + "Equals: " + comparison);
    }
}


/*
1. Zadeklaruj trzy zmienne liczbowe (całkowite) i przypisz im wartości. Następnie wypisz wartość największej z nich.
2. Sprawdź, czy wartość przypisana zmiennej jest parzysta, czy nie (wypisz na ekranie odpowiedni komunikat). Użyj google,
aby znaleźć sposób na sprawdzenie parzystości wartości.
3. Sprawdź, czy wartość zmiennej jest większa, mniejsza, czy równa zero (użyj google żeby znaleźć odpowiedź, jak obsłużyć
więcej niż dwa przypadki w instrukcji warunkowej).
 */
