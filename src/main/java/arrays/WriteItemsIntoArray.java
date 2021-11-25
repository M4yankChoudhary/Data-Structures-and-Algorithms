package arrays;

public class WriteItemsIntoArray {
    public static void main(String[] args) {
        int[] squareNumbers = new int[10];

        for(int i = 0; i< 10; i++) {
            int square = (i + 1) * (i + 1); // 1 * 1 or 2 * 2...
            squareNumbers[i] = square;
        }
        // read items in array using for loop
        for(int i = 0; i< 10; i++){
            System.out.println(squareNumbers[i]);
        }
        // using for each loop
        for(int item : squareNumbers) {
            System.out.println("Print items of an array using for each loop");
            System.out.println(item);
        }
    }
}
