import java.util.*;

public class PowerN {
    static double sum = 1.0;
    static void power(double x, double n){
        if(n > 0){
            sum *=  x;
            power(x, --n);
        }
    }

    static double power(double x, int n) {
        double ans = 1.0;
        long nn = n;
        if (nn < 0) nn = -1 * nn;
        while (nn > 0) {
          if (nn % 2 == 1) {
            ans = ans * x;
            nn = nn - 1;
          } else {
            x = x * x;
            nn = nn / 2;
          }
        }
        if (n < 0) ans = (double)(1.0) / (double)(ans);
        return ans;
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double n = sc.nextDouble();

        int nn = (int) n;
        
        sc.close();

        power(x,n);

        sum = power(x, nn);

        System.out.println(sum);
    }
}
