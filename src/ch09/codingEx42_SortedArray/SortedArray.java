package ch09.codingEx42_SortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    // write code here
    public static int[] getIntegers(int len) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            int num = scanner.nextInt();
            array[i] = num;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        //System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    //System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            //System.out.println("-->" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }
}