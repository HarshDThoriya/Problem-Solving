import java.util.*;

public class kthLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,2,1,6,4,2,5};

        int k = 5;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }

        for(int i=0; i<k-1; i++){
            pq.poll();
        }

        System.out.println(pq.peek());
    }
}
