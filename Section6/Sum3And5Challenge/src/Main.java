/*
=====================
Sum 3 and 5 Challenge
=====================

*Create a for loop using a range of numbers from 1 to 1000 inclusive.

*Sum all the numbers that can be divided by both 3 and 5

*Print out the numbers that have met the above conditions

*break out of the loop once you have found 5 numbers that met the conditions.

*After breaking out of the loop, print the sum of the numbers that met the conditions.

*Note: type all code in the main method
 */
public class Main {
    public static void main(String[] args) {
        int sumNumbers = 0;
        int numbersFound = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by 3 and 5");
                sumNumbers += i;
                numbersFound++;
            }
            if (numbersFound >= 5) {
                break;
            }
        }

        System.out.println("The sum of the found numbers is " + sumNumbers);
    }
}