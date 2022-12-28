public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-12121));
    }

    public static boolean isPalindrome(int num) {
        int tempNum = num;

        int reverse = 0;
        int lastDigit = 0;

        while (tempNum != 0) {
            lastDigit = tempNum % 10;
            reverse = (reverse * 10) + lastDigit;

            tempNum /= 10;
        }

        return num == reverse;

    }
}
