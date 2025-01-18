package PrefixSum;

public class CountPartitionsWithEvenDifference {
    public static void main(String[] args) {
        int[] nums = new int[]{10,10,3,7,6};

        int count = 0;
        int total = 0;

        for(int i=0; i<nums.length; i++){
            total += nums[i];
        }

        int sum = 0;

        for(int i=0; i<nums.length-1; i++){
            sum += nums[i];

            int diff = total - 2 * sum;

            if(diff % 2 == 0){
                count++;
            }
        }

        System.out.println(count);
    }
}
