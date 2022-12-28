public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(101299));
    }

    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) {
            return -1;
        }

        int sum = 0;
        int digit = 0;

        boolean isFirstLoop = true;

        while (num != 0) {
            digit = num % 10;
            num /= 10;

            //If it's the first loop, we know we're at the first digit
            if (isFirstLoop) {
                sum += digit;
                isFirstLoop = false;
            }
        }

        //Since num is now 0, we know that we have stored the last digit in the digit variable
        sum += digit;

        return sum;
    }
}
