import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ arr[i]; 
            xor1 = xor1 ^ (i + 1);       
        }
        xor1 = xor1 ^ N; 

        System.out.println(xor1 ^ xor2);

    }
}
