import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;

        int numLoops = 0;
        int currentNum = 0;

        boolean programRunning = true;
        boolean exitSet = false;
        int numExits = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("This program keeps track of the lowest and largest number you enter. Enter any non number to quit.");
        while (programRunning) {

            System.out.print("Enter a number: ");

            try {
                currentNum = Integer.parseInt(scanner.nextLine());

                if (!(numLoops == 0)) {
                    if (currentNum > max) {
                        max = currentNum;
                    }
                    if (currentNum < min) {
                        min = currentNum;
                    }
                } else {
                    min = currentNum;
                    max = currentNum;
                }

                System.out.println("Min: " + min + " Max: " + max);
                numLoops++;
            } catch (NumberFormatException e) {
                programRunning = false;
            }

        }
    }
}