package PrefixSum;

public class MinimumPositiveSumSubarray {
    public static void main(String[] args) {
        int nums[] = new int[]{3,-2,1,4};
        int l = 2;
        int r = 3;

        int ans=1<<30;

        for(int i=0;i<nums.length;++i)
        {
            int curr=0;
            for(int j=i;j<nums.length;++j)
            {
                curr+=nums[j];
                if((j-i+1)>=l && (j-i+1)<=r && curr>0){
                    ans=curr<ans?curr:ans;
                }
            }
        }
        
        System.out.println(ans==1<<30?-1:ans);
    }
}
