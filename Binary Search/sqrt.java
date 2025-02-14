import java.util.*;

public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();
        int low = 1, high = n;

        while (low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;
            if (val <= (long)(n)) {
                low = (int)(mid + 1);
            } else {
                high = (int)(mid - 1);
            }
        }
        
        System.out.println(high);
    }
}
