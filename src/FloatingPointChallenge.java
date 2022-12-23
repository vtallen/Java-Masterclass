import java.util.Scanner;
public class FloatingPointChallenge {
    public static void main(String[] args) {
        double poundsToKilograms = 0.45359237;

        Scanner scn = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number in pounds to convert to kilograms");

        double userPounds = Double.parseDouble(scn.nextLine());  // Read user input
        double result = userPounds * poundsToKilograms;

        System.out.print(userPounds + " lbs is " + result + " kg");
    }
}
