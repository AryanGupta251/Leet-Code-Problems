import java.util.Arrays;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigitLC {
    public static void main(String[] args) {
        int nums[]={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int nums[]){
        int count=0;
        for (int i:nums) {
            if(even(i)){
                count ++;
            }
        } return count;
    }

// function to check whether the number contains the even digits or not
    static boolean even(int num){
    int numberofdigits=digits(num);
    /*
    if(numberofdigits%2==0){
    return true;
        }
        return false
    }
     */
       return numberofdigits%2==0; //shortcut
    }

    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    /*  //shortcut to find the number of digits
    static int digits2(int num){
        return (int)(Math.log10(num))+1;
        */


}

