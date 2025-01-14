package PrefixSum;

public class MaxScoreAfterSplitString {
    public static void main(String[] args) {
        String s = "011101";
        int ones = 0;
        int zeros = 0;
        int best = Integer.MIN_VALUE;
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1') {
                ones++;
            } else {
                zeros++;
            }
            
            best = Math.max(best, zeros - ones);
        }
        
        if (s.charAt(s.length() - 1) == '1') {
            ones++;
        }

        System.out.println(ones + best);
    }   
}
