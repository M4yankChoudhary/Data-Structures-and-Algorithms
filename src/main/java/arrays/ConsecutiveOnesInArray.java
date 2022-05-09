package arrays;

// Given a binary array, find the maximum number of consecutive 1s in this array.
public class ConsecutiveOnesInArray {
    public static int findMaximumConsecutiveOnes(int[] nums) {
        int temp = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) { // start counting
                temp++;// increment count
                max = Math.max(max, temp); // get the maximum value
            } else { // set count to 0 and restart counting
                temp = 0;
            }
        }
        return max; // return the maximum value
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,0,1,1,0,1};
        System.out.println(findMaximumConsecutiveOnes(nums));
    }
}
