package liczbyLosowe;

import java.util.Random;

public class LiczbyLosowe {
    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(); // gereruje od minus do plus liczby
        System.out.println(a);

        int b = random.nextInt(11); //zakres losowania od 0 do 10 gdzie 11 nigdy nie zostanie wylosowane
        System.out.println(b);

        int c = random.nextInt(10) + 2;
        System.out.println(c);

        float d = random.nextFloat();
        System.out.println(d);

        double e = random.nextDouble();
        System.out.println(e);

        boolean f = random.nextBoolean();
        System.out.println(f);

        // float d = random.nextFloat() / 2;  mozemy sie bawic np mnozeniem dodawaniem dzieleniem odejmowaniem

        Random r = new Random();
        String str = "0123456789abcdefghijklmnoprstuvwxyzABCDEFGHIJKLMNOPRSTUVWYZ";
        int dlugoscStr = str.length();
        System.out.println("Długośc łańcucha: " + dlugoscStr);

        String kod = "";

        for (int x = 0; x < 12; x++){
            int pos = r.nextInt(dlugoscStr);
            kod = kod + str.charAt(pos);
        }
        System.out.println("Wygenerowany kod: " + kod);
    }
}
