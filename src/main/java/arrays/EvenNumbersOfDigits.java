package arrays;

public class EvenNumbersOfDigits {
    public static int findEvenNumbersWithDigit(int[] nums) {
        int count;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                System.out.println(nums[i]);
                count++;
            }
            if (count % 2 == 0) {
                max++;
            }
            System.out.println("Count:" + count);
        }
        return max; // return the maximum value
    }

    public static void main(String[] args) {
        int[] nums = new int[]{12,345,2,6,7896};
        System.out.println(findEvenNumbersWithDigit(nums));
    }
}
