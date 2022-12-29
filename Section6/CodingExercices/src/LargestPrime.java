public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(18));
        System.out.println(getLargestPrime(217));
    }
    
    public static int getLargestPrime(int num) {
        int largestPrimeFactor = 0;

        if (num <= 1) {
            return -1;
        }

        for (int i = 1; i <= num; i++) {
            boolean isPrimeNum = true;
            for (int a = 2; a < i; a++) {
                if (i % a == 0) {
                    isPrimeNum = false;
                }
            }

            if (num % i == 0 && isPrimeNum) {
                largestPrimeFactor = i;
            }
        }
        
        return largestPrimeFactor;
    }
    
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
