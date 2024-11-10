import java.util.*;

public class OneAppearance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int xor = arr[0];

        for(int i=1; i<n; i++){
            xor = xor ^ arr[i];
        }

        System.out.println(xor);

    }
}
