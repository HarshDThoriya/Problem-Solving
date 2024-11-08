import java.util.*;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int tempN = n;

        int digitsInN = (int) (Math.log10(n) + 1);
        
        int sum = 0;

        while(tempN>0){
            sum += Math.pow((tempN%10), digitsInN); 
            tempN /= 10;
        }

        if(n == sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
