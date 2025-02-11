public class lowerBound {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,8,10,11,12,19};
        int x = 0;

        int low = 0;
        int high = nums.length - 1;

        int lowerBound = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == x){
                lowerBound = mid;
                System.out.println(nums[mid]);
                System.exit(0);
            }
            else if(nums[mid] > x){
                high = mid-1;
            }
            else{
                lowerBound = mid;
                low = mid + 1;
            }
        }

        System.out.println(lowerBound == -1 ? -1 : lowerBound);
    }    
}
