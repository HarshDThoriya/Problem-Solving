import java.util.*;

public class StockBuySell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int maxProfit = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(min > arr[i]){
                min = arr[i];
            }else if(maxProfit < arr[i] - min){
                maxProfit = arr[i] - min;
            }
        }

        System.out.println("Max Profit possible is "+maxProfit);
    }
}
