package Maths;

public class triangularSum {
    static int triangularSumOfArray(int[] nums) {
        int count = nums.length-1;

        if(nums.length == 1){
            return nums[0];
        }

        while(count > 0){
            nums[0] = ( nums[0] + nums[1] ) % 10;
            for(int i=1; i<count; i++){
                nums[i] = (nums[i] + nums[i+1])%10;
            }
            count--;
        }

        return nums[0];
    }

    public static void main(String[] args) {
        int nums[] = new int[]{1,2,3,4,5};

        System.out.println(triangularSumOfArray(nums));
    }
}
