/*
This program has one method that checks if any of three ages
is a teenager

It also has another method that checks if the argument is a teenager

 */

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(12, 11, 11));
        System.out.println(isTeen(14));
    }

    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        if ((ageOne >= 13 && ageOne <= 19) || (ageTwo >= 13 && ageTwo <= 19) || (ageThree >= 13 && ageThree <= 19)) {
            return true;
        }

        return false;
    }

    public static boolean isTeen(int age) {
        return (age >= 13 && age <= 19);
    }
}
