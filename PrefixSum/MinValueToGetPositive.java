package PrefixSum;

public class MinValueToGetPositive {
    public static void main(String[] args) {

        int[] nums = new int[]{-3,2,-3,4,2};
        
        int min = Integer.MAX_VALUE;

        int sum = 0;

        for (int i=0; i<nums.length; i++){
            sum+=nums[i];

            if(sum < min){
                min = sum;
            }
        }

        if(min > 0){
            System.out.println(1);
        }

        System.out.println(min * -1 + 1);;

    }
}
