//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetterGreaterThenTargetLC {
    public static void main(String[] args) {
        char [] letter={'c','f','j'};
        char target='c';
        System.out.println(nextGreatestLetter(letter,target));
    }

    public static char nextGreatestLetter(char[] letters, char target){
        int start=0;
        int end= letters.length;
        while(start<end) {
            int mid = start + (end-start)/2;
            if (letters[mid]>target) {
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
