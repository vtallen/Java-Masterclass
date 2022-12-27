public class Main {
    public static void main(String[] args) {

        int startNum = 0;
        int endNum = 10000;

        int i = startNum;

        int numOdd = 0;
        int numEven = 0;

        while (i < endNum) {
            if (numEven >= 5) {
                break;
            }

            if (isEvenNumber(i)) {
                System.out.println(i);
                numEven++;
            } else {
                numOdd++;
            }

            i++;
        }

        System.out.println("Even numbers: " + numEven);
        System.out.println("Odd numbers " + numOdd);
    }

    public static boolean isEvenNumber(int num) {
        if (num == 0) {
            return false;
        }
        if (num == 2 || (num % 2 == 0)) {
            return true;
        }

        return false;
    }
}