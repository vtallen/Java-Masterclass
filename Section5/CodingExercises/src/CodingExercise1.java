/*
***********************************************************************
This program contains the method checkNumber which takes an int input
and prints to the console if the number is zero, positive, or negative.
 **********************************************************************
*/

public class CodingExercise1 {
    public static void main(String[] args) {

        checkNumber(0);
        checkNumber(10);
        checkNumber(-100);

    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}