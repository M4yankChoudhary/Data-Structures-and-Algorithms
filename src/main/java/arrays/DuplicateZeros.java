package arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        int length = arr.length;
        int[] arr2 = new int[length];

        int index = 0;
        for (int i = 0; i < length; i++) {
            if (arr[index] != 0) {
                arr2[i] = arr[index]; // if non-zero put as it is.
            } else { // if we got a zero
                arr2[i] = 0;
                if (i + 1 < length) { // don't go beyond index
                    arr2[i + 1] = 0;
                }
                i++; // we placed a zero so move one step forward
            }
            index++; // increase index by 1
        }
        for(int i=0; i< length; i++){
            arr[i]= arr2[i];
            System.out.println(arr[i]);
        }
    }
}
