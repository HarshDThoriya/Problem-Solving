package PrefixSum;

import java.util.*;

public class LongestSubsequenceWithLimitedSum {
    public static void main(String[] args) {
        int[] nums = new int[] {4,5,2,1};
        int[] queries = new int[] {3,10,21};

        int[] ans = new int[queries.length];

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        for (int i = 0; i < queries.length; i++) {
            int low = 0;
            int high = nums.length - 1;
            while (low <= high) {
                int mid = (low+high)/2;
                if(nums[mid] == queries[i]){
                    ans[i] = mid + 1;
                    break;
                }
                else if(nums[mid] < queries[i]){
                    ans[i] = mid+1;
                    low = mid +1;
                }
                else{
                    high = mid-1;
                }
            }
        }

        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
        
    }
}
