import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        int  i=0;
        for(int j=1; j<n; j++){
            if(arr[j] == arr[j-1]){
                continue;
            }
            else{
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(i+1);

        for(int k =0; k<i+1; k++){
            System.out.println(arr[k]);
        }
    }    
}
