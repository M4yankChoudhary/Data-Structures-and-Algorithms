package arrays;

public class ArrayLength {

    public static void main(String[] args) {
        int[] arr = new int[7];
        int length = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = i;
            length++;
        }
        System.out.println("Length: "+length);
        System.out.println("Capacity: " +arr.length);
    }

    // When an Array is given as a parameter,
    // without any additional information,
    // you can safely assume that length == capacity.
}
