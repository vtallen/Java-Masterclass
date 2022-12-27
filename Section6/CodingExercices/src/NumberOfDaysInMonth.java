public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(12, 10000));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 400 == 0) {
                return true;
            } else if (year % 4 == 0 && year % 100 > 0) {
                return true;
            }
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        int numDays = -1;

        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    numDays = 30;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numDays = 31;
                    break;
                case 2:
                    numDays = isLeapYear(year) ? 29 : 28;
                    break;
                default:
                    numDays = -1;
            }
        }
        return numDays;
    }


    /*
    The way I wanted to do it, but Udemy is running on an old version of java.

    public static int getDaysInMonth(int month, int year) {
        int numDays = switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };

        return numDays;
    }
     */
}
