package Maths;

public class PalidromeNumber {
    static boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        long reversed = 0;
        long original = x;

        while(original > 0){
            reversed = reversed * 10 +  (original % 10);
            original /= 10;
        }
        
        if(reversed == x){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 121;

        System.out.println(isPalindrome(num));
    }
}
