public class countOccurrences {
    public static void main(String[] args) {
        int nums[] = new int[]{1, 1, 2, 2, 2, 2, 3};
        int target = 2;

        int low = 0;
        int high = nums.length - 1;

        int count = 0;

        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] == target){
                int temp = mid + 1;
                while(mid >= 0){
                    if(nums[mid] == target){
                        count++;
                    }
                    else{
                        break;
                    }
                    mid--;
                }

                while(temp <= nums.length - 1){
                    if(nums[temp] == target){
                       count++;
                    }
                    else{
                        break;
                    }
                    temp++;
                }

                System.out.println(count);
                System.exit(1);
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        System.out.println(count);
        System.exit(1);
    }
}
