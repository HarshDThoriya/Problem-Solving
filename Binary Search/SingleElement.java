public class SingleElement {
    public static void main(String[] args) {
        int nums[] = new int[]{1,1,2,3,3,4,4,8,8};
        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2; 
            } else {
                end = mid;
            }
        }
        System.out.println(nums[start]);
    }
}
