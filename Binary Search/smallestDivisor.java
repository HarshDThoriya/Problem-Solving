public class smallestDivisor {

    public static void main(String[] args) {
        int threshold = 6;
        int[] nums = new int[]{1,2,5,9};
        
        int low = 1, high = 1000000;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(result(nums, mid, threshold)) high = mid - 1;
            else low = mid + 1;
        }
        System.out.println(low);
    }
    private static boolean result(int nums[], int divisor, int threshold){
        int ans = 0;
        for(int i : nums){
            ans += Math.ceilDiv(i, divisor);
        }
        return ans <= threshold;
    }
    
}
