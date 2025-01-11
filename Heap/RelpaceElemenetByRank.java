package Heap;
import java.util.*;

public class RelpaceElemenetByRank {
    public static void main(String[] args) {
        int[] arr = new int[]{20,15,26,2,98,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        HashMap<Integer, Integer> hm = new HashMap<>();


        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }

        int index = 1;

        while(!pq.isEmpty()){
            hm.put(pq.poll(),index);
            index++;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(hm.get(arr[i]) + " ");
        }

    }
}
