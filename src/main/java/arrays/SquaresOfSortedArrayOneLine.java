package arrays;

import java.util.Arrays;

public class SquaresOfSortedArrayOneLine {
    public static int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(x -> x * x).sorted().toArray();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,7,2,8};
        for(int i: sortedSquares(nums)) {
            System.out.println(i);
        }
    }
}
