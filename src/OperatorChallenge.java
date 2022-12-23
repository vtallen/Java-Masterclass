public class OperatorChallenge {
    public static void main(String[] args) {
        double valueOne = 20.00d;
        double valueTwo = 80.00d;

        double result = (valueOne + valueTwo) * 100.0d;
        System.out.println("result=" + result);

        double remainder = result % 40.00d;
        System.out.println("remainder=" + remainder);

        boolean isNoRemainder = remainder == 0.00d ? true : false;
        System.out.println("isNoRemainder=" + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
