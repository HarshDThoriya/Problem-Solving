package PrefixSum;

public class PointsThatIntersectWithCars {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{3,6}, {1,5}, {4,7}}; 

        int[] ans = new int[101];

        for(int i=0; i<nums.length; i++){
            ans[nums[i][0]-1] += 1;
            ans[nums[i][1]] -= 1;
        }

        int count = 0;
        if(ans[0] > 0){
            count++;
        }

        for(int i=1; i<ans.length; i++){
            ans[i] += ans[i-1];
            if(ans[i] > 0){
                count++;
            }
        }

        System.out.println(count);
    }
}
