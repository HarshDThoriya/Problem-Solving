public class findMinInRotatedSorted {
    public static void main(String[] args) {
        int nums[] = new int[]{3,4,5,1,2};

        int left = 0, right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(nums[left]);
    }
}
