package arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 0, 0, 0};
        int[] arr2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        int p = m - 1;
        int q = n - 1;
        int l = (m + n) - 1;
        while (p >= 0 && q >= 0) {
            if(arr[p] >= arr2[q]){
                System.out.print("When P is greater :");
                System.out.println(arr[l--] = arr[p--]);
            } else {
                System.out.print("When Q is greater :");
                System.out.println(arr[l--] = arr2[q--]);
            }
        }
        while( p>=0) {
            arr[l--] = arr[p--];
        }
        while(q>=0){
            arr[l--] = arr2[q--];
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
