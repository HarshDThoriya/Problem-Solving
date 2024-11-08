import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int reverseN = 0;
        while(n>0){
            reverseN = reverseN * 10 + n%10;
            n /= 10;
        }    
        
        System.out.println(reverseN);
    }
}
