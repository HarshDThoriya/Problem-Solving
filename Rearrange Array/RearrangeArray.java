import java.util.*;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int posIndex = 0;
        int negIndex = 1;

        if(arr[0] < 0){
            posIndex = 1;
            negIndex = 0;
        }

        int[] newArr = new int[n];
        
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                newArr[posIndex] = arr[i];
                posIndex+=2;
            }
            else{
                newArr[negIndex] = arr[i];
                negIndex+=2;
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(newArr[i]);
        }
    }
}