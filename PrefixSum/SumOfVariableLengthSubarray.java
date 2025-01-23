package PrefixSum;

public class SumOfVariableLengthSubarray {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1};

        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];

        for(int i=1; i<nums.length; i++){
            prefixSum[i] = nums[i] + prefixSum[i-1];
        }

        int sum = 0;

        for(int i=0; i<prefixSum.length; i++){
            int start = Math.max(0, i - nums[i]);
            
            if(start > 0){
                sum += prefixSum[i] - prefixSum[start - 1];
            }
            else{
                sum+= prefixSum[i];
            }
        }

        System.out.println(sum);
    }   
}
