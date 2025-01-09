import java.util.*;

public class SortKsortedArrays {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,10},{4,5,6},{7,8,9}};
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                pq.add(arr[j][i]);
            }
        }

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        
    }
}
