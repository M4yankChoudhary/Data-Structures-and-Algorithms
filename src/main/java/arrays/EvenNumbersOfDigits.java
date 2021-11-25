package arrays;

public class EvenNumbersOfDigits {
    public static int findEvenNumbersOfDigits(int[] nums) {
        int count;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                count++;
            }
            if (count % 2 == 0) {
                max++;
            }
        }
        return max; // return the maximum value
    }

    public static void main(String[] args) {
        int[] nums = new int[]{12,345,2,6,7896};
        System.out.println(findEvenNumbersOfDigits(nums));
    }
}
