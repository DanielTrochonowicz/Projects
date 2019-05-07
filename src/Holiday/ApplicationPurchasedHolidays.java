package Holiday;
import java.util.Scanner;


public class ApplicationPurchasedHolidays {
    public static void main(String[] args) {

        Scanner listOfHolidays = new Scanner(System.in);
        String holiday = listOfHolidays.nextLine();

        try {
            SelectedPackage selectedPackage = new SelectedPackage(holiday);
            selectedPackage.holidays();
        }catch (Exception e){
            System.out.println("There are no such trips.");
        }
    }
}
