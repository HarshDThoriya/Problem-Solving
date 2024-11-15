import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int count = 0;
        int element = 0;

        for (int i = 0; i < n; i++) {
            if(count == 0){
                count = 1;
                element = arr[i];
            }
            else if(element == arr[i]){
                count++;
            }
            else{
                count--;
            }
        }

        if(count > 0){
            System.out.println("Majority Element is: "+ element);
        }
        else{
            System.out.println("There is no majority Element");
        }
    }
}
