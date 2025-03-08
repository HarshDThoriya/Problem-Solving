package Maths;

public class missingNumber {
    static int missingNumberInArr(int[] nums) {
        int sum = (nums.length * (nums.length+1))/2;

        for(int i=0; i<nums.length; i++){
            sum -= nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,3,6,5};

        System.out.println(missingNumberInArr(arr));
    }
}
