package Maths;

public class minSumOfFourDigitsAfterSplit {
    static int minimumSum(int num) {
        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        int a = d1 * 10 + d2;
        int b = d3 * 10 + d4;
        int c = d1 * 10 + d4;
        int d = d2 * 10 + d3;
        int e = d2 * 10 + d1;
        int f = d4 * 10 + d3;
        int g = d4 * 10 + d1;
        int h = d1 * 10 + d3;
        int i = d2 * 10 + d4;
        int j = d4 * 10 + d2;
        int k = d3 * 10 + d1;

        return Math.min(a + b, Math.min(j + k, Math.min(b + e, Math.min(c + d, Math.min(d + g, Math.min(a + f, h + i))))));
    }

    public static void main(String[] args) {
        System.out.println(minimumSum(2932));
    }
}
