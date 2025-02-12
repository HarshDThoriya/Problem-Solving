public class upperBound {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 6, 8, 8, 6, 5, 5, 6};
        int x = 10;

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
                lowerBound = mid;
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }

        System.out.println(lowerBound == -1 ? -1 : lowerBound);
    }    
}
