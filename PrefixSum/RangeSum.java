package PrefixSum;

class NumArray {
    private int[] pf;

    public NumArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        this.pf = nums;
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return pf[right];
        }
        return pf[right] - pf[left - 1];
    }
}

public class RangeSum {
    public static void main(String[] args) {
        NumArray obj = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});

        System.out.println(obj.sumRange(0, 2));
        System.out.println(obj.sumRange(2, 5));
        System.out.println(obj.sumRange(0, 5));
    }
}
