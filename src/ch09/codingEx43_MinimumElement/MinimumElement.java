package ch09.codingEx43_MinimumElement;

import java.util.Scanner;

public class MinimumElement {
    // write code here
    private static int readInteger() {
        System.out.println("Enter element number:");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        return num;
    }

    private static int[] readElements(int len) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.println("enter the Element:");
            array[i] = scanner.nextInt();
            //scanner.nextLine();
        }

        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min)
                min = el;
        }
        return min;
    }
}