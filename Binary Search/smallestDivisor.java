public class smallestDivisor {

    static int findSum(int[] nums, int divisor){
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum+= (int)Math.ceil((float)nums[i]/divisor);
        }
        return sum;
    }
    public static void main(String[] args) {
        int limit = 6;
        int[] nums = new int[]{1,2,5,9};

        int maxElement = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){ 
            if(maxElement < nums[i]){
                maxElement = nums[i];
            }
        }

        int low = 1;
        int high = maxElement;

        int minElement = Integer.MAX_VALUE;

        while(low<=high){
            int mid = (low+high)/2;
            
            int sum = findSum(nums, mid);

            
            
            if(sum > limit){
                low = mid + 1;
            }
            else{
                minElement = mid;
                high = mid - 1;
            }
            
        }


        System.out.println(minElement);
    }
}
