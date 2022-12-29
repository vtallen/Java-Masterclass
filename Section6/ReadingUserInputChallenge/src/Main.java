import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numValues = 5;
        int sumValues = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will sum " + numValues + " values.");
        for (int i = 0; i < numValues; i++) {
            boolean isNumberValid = false;
            int value = 0;

            do {
                try {
                    System.out.print("Enter #" + (i + 1) + ": ");
                    value = Integer.parseInt(scanner.nextLine());
                    isNumberValid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Number!");
                }
            } while (!isNumberValid);

            sumValues += value;
        }

        System.out.println("Sum: " + sumValues);

    }
}