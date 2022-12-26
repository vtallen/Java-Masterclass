public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(1443463450);
        System.out.println();
    }

    public static void printYearsAndDays(long minutes) {
        if (!(minutes < 0)) {
            long days = minutes / 1440;
            long years = days / 365;
            days -= years * 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        } else {
            System.out.println("Invalid Value");
        }

    }
}