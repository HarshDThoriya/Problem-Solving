import java.util.*;
public class CheckPalindrome {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int tempN = n;
        int reverseN = 0;
        while(tempN>0){
            reverseN = reverseN * 10 + tempN%10;
            tempN /= 10;
        }    

        boolean isPalindrome = false;
        
        if(n == reverseN){
            isPalindrome = true;
        }

        System.out.println(isPalindrome);
    }
}
