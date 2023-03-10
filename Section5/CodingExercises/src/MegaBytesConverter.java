/*
* *****************************************************
* This program has a method that converts an int value representing
* kilobytes and converts it into megabytes and remaining kilobytes
* *****************************************************
 */
public class MegaBytesConverter {
    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (!(kiloBytes < 0)) {
            int mb = (kiloBytes / 1024);
            int kbRemainder = kiloBytes % 1024;

            System.out.println(kiloBytes +
                    " KB = " +
                    mb + " MB and " +
                    kbRemainder + " KB"
            );
        } else {
            System.out.println("Invalid Value");
        }
    }
}