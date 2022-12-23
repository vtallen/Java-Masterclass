public class OperatorChallenge {
    public static void main(String[] args) {
        double valueOne = 20.00;
        double valueTwo = 80.00;

        double result = (valueOne + valueTwo) * 100.0;

        double remainder = result % 40.00;

        boolean noRemainder = (remainder == 0.00) ? true : false;

        System.out.println("value of noRemainder boolean: " + noRemainder);

        if (!noRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
