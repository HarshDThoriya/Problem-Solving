import java.util.*;

public class FindPivotindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        sc.close();
        
        int pivotIndex = -1;

        int total = 0;
        for (int num : nums) {
            total += num;
        }
        
        int leftTotal = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightTotal = total - leftTotal - nums[i];
            if (rightTotal == leftTotal) {
                pivotIndex = i;
                break;
            }
            leftTotal += nums[i];
        }


        System.out.println("Pivot Index: " + pivotIndex);
    }
}
