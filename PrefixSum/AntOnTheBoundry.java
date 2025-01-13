package PrefixSum;

public class AntOnTheBoundry {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,-5};
        
        int count = 0;

        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum == 0){
                count++;
            }
        }

        System.out.println(count);
    }
}
