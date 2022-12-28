public class PerfectNumber {
    public static void main(String[] args) {

    }


    public static boolean isPerfectNumber(int num) {
        if (num < 1) {
            return false;
        }

        int sumDivisors = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumDivisors += i;
            }
        }

        return num == sumDivisors;

    }
}
