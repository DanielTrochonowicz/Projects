package Game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        String[] animals = {"dog", "horse", "mous", "cat",
                "bear", "bird", "cow", "chicken", "duck"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int fails = 0;
        int round = 0;
        String response;
        while (fails <= 3){
            String animal = animals[random.nextInt(animals.length)];
            String hashAnimal = animal;



            for (int i = 0; i < round; i += 5) {
                char randomChar = hashAnimal.charAt(random.nextInt(hashAnimal.length()));
                if (randomChar == '*'){
                    i--;
                    continue;
                }
                hashAnimal = hashAnimal.replaceFirst(String.valueOf(randomChar), "*");

              }

            System.out.println("Give the word: " + hashAnimal);
            System.out.println("You selected word");
            response = scanner.nextLine();

            if (animal.equalsIgnoreCase(response)){
                System.out.println("Good!!!");
                round++;
            }else{
                System.out.println("Sorry, wrong answer");
                fails++;
            }
        }
        System.out.println("End of your game. Your points:" + round);
    }
}
