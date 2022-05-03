package binary_search;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
//        int[] arr = new int[5];
        int[] arr = new int[]{  // sorted array
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        //      ^L                         ^R   --- pointers (left & right)
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();    
        System.out.println("Target found at index: " + search(arr, n));
        scanner.close();
    }

    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) { // move the right pointer
                right = mid - 1;
            } else if (target > arr[mid]) { // move the left pointer
                left = mid + 1;
            }
        }
        return -1;
    }
}
