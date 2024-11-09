import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        sc.close();

        int numOfDigitsInN = (int) (Math.log10(n) + 1);

        System.out.println(numOfDigitsInN);
    }
}
