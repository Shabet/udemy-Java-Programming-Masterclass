package ch09.ex11_MultpleArraysPart2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];
        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                array2[i][j] = (i * 10) + (j +1);
            }
        }

        System.out.println(Arrays.deepToString(array2));
        System.out.println("_".repeat(70));

        // change row1 values
        array2[1] = new int[]{10, 20, 30};
        System.out.println(Arrays.deepToString(array2));
        System.out.println("_".repeat(70));

        //Object
        System.out.println("#-> Array of Object");
        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));
        System.out.println("_".repeat(70));

        anyArray[0] = new String[]{"a", "b", "c"};
        anyArray[1] = new String[][]{
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        anyArray[2] = new int[2][2][2];
//        anyArray[2] = "Hello";
        System.out.println(Arrays.deepToString(anyArray));
        System.out.println("_".repeat(70));

        for (Object element : anyArray) {
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }

    }
}
