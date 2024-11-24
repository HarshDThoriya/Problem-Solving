import java.util.*;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] gain = new int[n];

        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }
     
        sc.close();

        int altitude = 0;
        int maxAltitude = 0;

        for(int i=0; i<n; i++){
            altitude += gain[i];

            if(altitude > maxAltitude){
                maxAltitude = altitude;
            }
        }

        System.out.println("Max Altitude: " + maxAltitude);
    }
}
