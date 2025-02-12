public class firstLastOccurrance {
    public static void main(String[] args) {
        int nums[] = new int[]{5,7,7,8,8,10};
        int target = 8;

        int low = 0;
        int high = nums.length - 1;

        int output[] = new int[]{-1,-1};

        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] == target){
                int temp = mid;
                while(mid >= 0){
                    if(nums[mid] == target){
                        output[0] = mid;
                    }
                    else{
                        break;
                    }
                    mid--;
                }

                while(temp <= nums.length - 1){
                    if(nums[temp] == target){
                        output[1] = temp;
                    }
                    else{
                        break;
                    }
                    temp++;
                }

                System.out.println(output[0] + " " + output[1]);
                System.exit(1);
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        System.out.println(output[0] + " " + output[1]);
        System.exit(1);
    }
}
