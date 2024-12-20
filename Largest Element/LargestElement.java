import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        int max = -1;

        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Max element in array is: " + max);
    }    
}
