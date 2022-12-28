public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2211112));
    }

    public static int getEvenDigitSum(int num) {
        int sum = 0;

        if (num < 0) {
            return -1;
        }

        int digit;
        while (num != 0) {
            digit = num % 10;
            num /= 10;

            if (digit % 2 == 0) {
                sum += digit;
            }
        }

        return sum;
    }
}
