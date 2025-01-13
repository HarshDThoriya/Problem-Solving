package PrefixSum;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};

        for(int i=1; i<nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }   
}
