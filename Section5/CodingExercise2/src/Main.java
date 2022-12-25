/*
 * **********************************************************************
 *  This program has 2 methods. One converts kilomters/h to miles/h and
 * returns a rounded long.
 *
 * The other method takes a double and prints out that number converted
 * to miles per hour.
 *
 * **********************************************************************
 */

public class Main {
    public static void main(String[] args) {

        printConversion(100);

    }


    public static long toMilesPerHour(double kilometersPerHour) {
        double conversionRate = 1.609;
        if (!(kilometersPerHour < 0)) {
            return Math.round(kilometersPerHour / conversionRate);
        } else {
            return -1;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            System.out.println(
                kilometersPerHour +
                " km/h = " +
                toMilesPerHour(kilometersPerHour) +
                " mi/h"
            );
        } else {
            System.out.println("Invalid Value");
        }
    }
}