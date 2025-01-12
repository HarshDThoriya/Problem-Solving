package PrefixSum;

public class FindThePivot {
    public static void main(String[] args) {
        int n = 8;
        int total = n*(n+1)/2;
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum+=i;
            if(sum == (total - sum + i)){
                System.out.println(i);
                System.exit(0);
            }
        }

        System.out.println(-1);
    }
}
