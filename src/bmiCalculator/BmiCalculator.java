package bmiCalculator;

import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("This is BMI calculator.\n");

        System.out.println("Enter your height cm: ");
        double height = user.nextDouble();

        System.out.println("Enter your body mass kg: ");
        double weight = user.nextDouble();

        double bmi = (100 * 100 * weight) / (height * height);

        //Zaokrąglenie do 5 miejsca po przecinku.
        bmi = bmi;
        bmi *= 100000; // bmi = bmi * 100;
        bmi = Math.round(bmi);
        bmi /= 100000;// bmi = bmi / 100;
        System.out.println("Your bmi is: " + bmi);

        if (bmi < 16.00) {
            System.out.println("Starving: " + bmi);
        } else if (bmi >= 16.00 && bmi <= 16.99){
            System.out.println("Emaciation: " + bmi);
        } else if (bmi >= 17.00 && bmi <= 18.49){
            System.out.println("Underweight: " + bmi);
        } else if (bmi >= 18.50 && bmi <= 24.99 ){
            System.out.println("Correct value: " + bmi);
        } else if (bmi >= 25.00 && bmi <= 29.99 ){
            System.out.println("Overweight: " + bmi);
        }else if (bmi >= 30.00 && bmi <= 34.99){
            System.out.println("First degree of obesity: " + bmi);
        }else if (bmi >= 35.00 && bmi <= 39.99){
            System.out.println("Second degree of obesity (Clinical obesity): " + bmi);
        }else if (bmi >= 40){
            System.out.println("Third degree of obesity (Extreme obesity): " + bmi);
        }
    }
}
