package dev.vta;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        reverse(test);
        System.out.println(Arrays.toString(test));
        System.out.println(findMin(readIntegers()));
    }

    public static int[] readIntegers() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a comma delimited list of integers:");
        String userInput = s.nextLine();

        String[] stringArray = userInput.split(",");
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i].trim());
        }

        return intArray;
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static void reverse(int[] array) {
        int temp;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length -i - 1] = temp;
        }
    }
}
