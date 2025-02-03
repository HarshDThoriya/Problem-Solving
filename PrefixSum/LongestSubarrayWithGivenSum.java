package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        int k = 10;

        int n = a.length;

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        System.out.println(maxLen);
    }
}
