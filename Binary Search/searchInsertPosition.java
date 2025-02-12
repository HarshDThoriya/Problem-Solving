public class searchInsertPosition {
    public static void main(String[] args) {
        int nums[] = new int[]{1,3,5,6};
        int target = 7;

        int low = 0;
        int high = nums.length - 1;

        int output = -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] == target){
                System.out.println(mid);
                System.exit(0);
            }
            else if(nums[mid] > target){
                output = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        System.out.println(output == -1 ? nums[nums.length - 1] < target ? nums.length : 0 : output);
    }
}
