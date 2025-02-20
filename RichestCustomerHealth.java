//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealthLC {
    public static void main(String[] args) {
        int acounts[][]={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(acounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <accounts.length ; i++) {
            int sum=0;
            for (int j = 0; j <accounts[i].length; j++) {
                sum+=accounts[i][j];
            }if(sum>max){
                max=sum;
            }
        }
        return max;

    }
}
