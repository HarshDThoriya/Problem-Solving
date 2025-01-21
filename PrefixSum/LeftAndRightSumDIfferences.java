package PrefixSum;

public class LeftAndRightSumDIfferences {
    public static void main(String[] args) {
        int[] nums = new int[]{10,4,8,3};
        int total = 0;

        int[] answer = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            total+= nums[i];
        }

        int currentSum = 0;

        for(int i=0; i<nums.length; i++){
            currentSum += nums[i];
            answer[i] = Math.abs(total - 2 * currentSum + nums[i]); 
        }

        //answer <- is the final array
    }
}
