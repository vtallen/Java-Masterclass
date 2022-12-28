public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(99, 99));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        int num1Digit;
        while (num1 != 0) {
            num1Digit = num1 % 10;
            num1 /= 10;

            int tempNum2 = num2;
            int tempNum2Digit;
            while (tempNum2 != 0) {
                tempNum2Digit = tempNum2 % 10;
                tempNum2 /= 10;

                if (num1Digit == tempNum2Digit) {
                    return true;
                }
            }
        }

        return false;
    }
}
