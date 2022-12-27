public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 10));
    }

    public static boolean isOdd(int num) {
        if (num > 0 && num % 2 > 0) {
            return true;
        }

        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = -1;

        if (start <= end && start > 0 && end > 0) {
            sum = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }

        return sum;
    }
}
