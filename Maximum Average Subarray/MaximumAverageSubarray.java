import java.util.*;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        
        sc.close();

        double currentAvg = 0;
        
        for(int i=0; i<k; i++){
            currentAvg += nums[i];
        }
        
        currentAvg /= k;
        double maxAverage = currentAvg;

        int i=1;
        int j = k;

        while(j < n){
            currentAvg = ((currentAvg * k) - nums[i-1] + nums[j])/k;
            if(currentAvg > maxAverage){
                maxAverage = currentAvg;
            }
            i++;
            j++;
        }

        System.out.println("Max Average: "+maxAverage);
    }
}
