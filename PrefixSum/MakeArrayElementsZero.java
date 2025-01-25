package PrefixSum;

public class MakeArrayElementsZero {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 0, 2, 0, 3 };

        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        int sum = 0;
        int answer = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            if(nums[i] != 0){
                continue;
            }

            if(sum == total - sum){
                answer += 2;
            }
            else if(Math.abs(total - 2 * sum ) == 1){
                answer+=1;
            }
        }

        System.out.println(answer);

    }
}
