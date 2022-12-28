public class GetDigitCount {
    public static void main(String[] args) {
        System.out.println(getDigitCount(100000));
        System.out.println(reverse(0));

        numberToWords(100);

    }

    public static int getDigitCount(int num) {
        if (num < 0) {
            return -1;
        }
        if (num == 0) {
            return 1;
        }

        int numDigits = 0;

        while (num != 0) {
            num /= 10;
            numDigits++;
        }

        return numDigits;
    }

    public static int reverse(int num) {
        int reversedNum = 0;
        int lastDigit = 0;

        while (num != 0) {
            lastDigit = num % 10;

            reversedNum = (reversedNum * 10) + lastDigit;

            num /= 10;
        }

        return reversedNum;
    }

    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNum = reverse(num);
        int numDigits = getDigitCount(num);
        int numZeros = 0;
        int lastDigit;

        if (numDigits != getDigitCount(reversedNum)) {
            numZeros = numDigits - getDigitCount(reversedNum);
        }

        if (reversedNum == 0) {
            System.out.println("Zero");
        }
        while (reversedNum != 0) {
            lastDigit = reversedNum % 10;
            reversedNum /= 10;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("UNKNOWN ERROR");
            }

            if (reversedNum == 0) {
                for (int i = 1; i <= numZeros; i++) {
                    System.out.println("Zero");
                }
            }

        }
    }

}
