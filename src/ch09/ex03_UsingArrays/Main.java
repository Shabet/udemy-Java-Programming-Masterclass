package ch09.ex03_UsingArrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArrays = new int[10];
        System.out.println(Arrays.toString(secondArrays));
        Arrays.fill(secondArrays, 5); // fill
        System.out.println(Arrays.toString(secondArrays));

        int[] thirdArrays = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArrays));

        int[] fourthArrays = Arrays.copyOf(thirdArrays, thirdArrays.length);
        System.out.println(Arrays.toString(fourthArrays));

        Arrays.sort(fourthArrays); // sort(mutable)
        System.out.println(Arrays.toString(thirdArrays));
        System.out.println(Arrays.toString(fourthArrays));

        int[] smallerArray = Arrays.copyOf(thirdArrays, 5); //copy small elements
        System.out.println(Arrays.toString(smallerArray));

        int[] largeArray = Arrays.copyOf(thirdArrays, 15); //copy large elements
        System.out.println(Arrays.toString(largeArray));
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
