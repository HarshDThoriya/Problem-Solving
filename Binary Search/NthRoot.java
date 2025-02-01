import java.util.*;

public class NthRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.close();

        int low = 1;
        int high = m;
        int ans = -1;

        while(low < high){
            int mid = ( low + high ) / 2;
            if(Math.pow(mid, n) > m){
                high = mid - 1;
            }
            else if(Math.pow(mid, n) < m){
                low = mid + 1;
            }
            else{
                ans = mid;
                break;
            }
        }

        System.out.println(ans);
    }    
}
