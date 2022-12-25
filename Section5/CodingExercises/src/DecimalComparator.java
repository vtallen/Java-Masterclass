/*
* ***********************************************************
* This program has a method that returns true if both arguments
* entered are equal up to 3 decimal places.
* ***********************************************************
 * */

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.176, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
        numOne = (int) (numOne * 1000);
        numTwo = (int) (numTwo * 1000);

        return (numOne == numTwo);
    }
}
