import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long avg = 0;
        int numValues = 1;

        int currentNum = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                currentNum = Integer.parseInt(scanner.nextLine());

                sum += currentNum;
                avg = sum / numValues;
            } catch (NumberFormatException e) {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
            numValues++;
        }
    }
}
