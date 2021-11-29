package arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int valueToRemove = 2;
        int start = 0;
        int index;
        int n = nums.length;
        System.out.println("Total elements before: " + (n));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (index = 0; index < n; index++) {
            if (nums[index] != valueToRemove) {
                // first put then -> increment the start
                nums[start++] = nums[index];
            }
        }
        System.out.println("------------------------------");
        System.out.println("Total elements after: " + (start + 1));
    }
}
