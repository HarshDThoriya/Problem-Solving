public class binarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;

        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(target == nums[mid]){
                System.out.println(mid);
                System.exit(1);
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        System.out.println(-1);
    }
}
