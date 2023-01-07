import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        int[] randomArray = new int[r.nextInt(10)];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = r.nextInt(20);
        }

        int[] reverseSortedArray = reverse(randomArray);
        System.out.println(Arrays.toString(reverseSortedArray));
    }

    public static int[] reverse(int[] array) {

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("------>" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("--->" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }
}