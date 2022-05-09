package arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int start = 0;
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            if(arr[i] != arr[i+1]){
                arr[start++] = arr[i];
            }
        }
        arr[start]= arr[len -1];
        System.out.println(start+1);
    }
}
