package linear_search;
// question - https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts =  {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        // for every person
        if (accounts.length == 0) {
            return 0;
        }
        int max = 0;
        for (int person = 0; person < accounts.length; person++) {
            int rowSum = 0;
            // for every account of each person
            for (int bankAccount = 0; bankAccount < accounts[person].length; bankAccount++) {
                rowSum += accounts[person][bankAccount];
            }
            if (rowSum > max) {
                max = rowSum;
            }
        }

        return max;

    }
}
