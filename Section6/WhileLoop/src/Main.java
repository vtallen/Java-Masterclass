public class Main {
    public static void main(String[] args) {
        /*for (int i = 0; i <= 5; i++) {
            //System.out.println(i);
        }

        int j = 0;
        boolean isReady = false;
        do {
            System.out.println(j);
            j++;
            isReady = (j < 5);
        } while (isReady);*/

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }


}