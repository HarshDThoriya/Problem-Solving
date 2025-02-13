package Maths;

public class gcdOfArray {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    static int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        return gcd(max, min);

    }

    public static void main(String[] args) {
        int nums[] = new int[]{4,2,3,9,5,6,7,8};

        System.out.println(findGCD(nums));

    }
}
