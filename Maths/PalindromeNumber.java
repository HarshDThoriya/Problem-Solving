package Maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;

        if(x < 0){
            System.out.println("False");
            System.exit(0);
        }
        
        long reversed = 0;
        long original = x;

        while(original > 0){
            reversed = reversed * 10 +  (original % 10);
            original /= 10;
        }

        if(reversed == x){
           System.out.println("True");
           System.exit(0);
        }
        System.out.println("False");
    }
}
