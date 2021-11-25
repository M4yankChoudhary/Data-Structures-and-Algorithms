package arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1};
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr2);
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
