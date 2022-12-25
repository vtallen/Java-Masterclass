/*
Write a method hasEqualSum with 3 parameters of type int.

The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.
 */

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 5, 3));
    }

    public static boolean hasEqualSum(int numOne, int numTwo, int sumNum) {
        return (numOne + numTwo) == sumNum;
    }
}
