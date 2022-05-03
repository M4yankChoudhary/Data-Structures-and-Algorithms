package linear_search;

public class FindMinimumInArray {
    public static void main(String[] args) {
        int[] arr = {564, 56, 3, 34, 43};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int minimum = arr[0];
        if (arr.length == 0) {
            return -1;
        }
        for (int i : arr) {
            if (i < minimum) {
                minimum = i;
            }
        }
        return minimum;
    }

}
