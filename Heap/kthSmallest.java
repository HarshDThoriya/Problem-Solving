import java.util.*;

public class kthSmallest {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,4,2,1,6,4,2,5};

        int k = 2;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
        }

        for(int i=0; i<k-1; i++){
            pq.poll();
        }

        System.out.println(pq.peek());
    }
}
