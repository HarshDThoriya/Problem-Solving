import java.util.*;

public class kokoEatingBanans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int h = sc.nextInt();

        for(int i=0;i <n; i++){
            a[i] = sc.nextInt();
        }

        sc.close();

        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++){
            if(max < a[i]){
                max = a[i];
            }
        }

        int low = 1;
        int high = max;
        while(low < high){
            int mid = (low + high) / 2;

            int hours = 0;

            for(int i = 0; i < a.length; i++){
                hours += Math.ceil((double)a[i] / (double)mid);
            }

            if(hours > h){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        System.out.println(low);
    }    
}
