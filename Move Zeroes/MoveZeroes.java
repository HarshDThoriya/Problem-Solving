import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int j = 1;
        int i = 0;

        while(j<n){
            if(arr[i]!=0){
                i++;
            }
            else if(arr[j] == 0){
                j++;
            }
            else{
                arr[i] = arr[j];
                arr[j]=0;
                j = i+1;
            }
        }

        for(int k=0; k<n; k++){
            System.out.println(arr[k]);
        }
    }
}
