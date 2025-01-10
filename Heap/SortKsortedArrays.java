package Heap;

import java.util.*;

class HeapItem implements Comparable<HeapItem> {
    int[] arr;
    int index;

    public HeapItem(int[] arr, int index) {
        this.arr = arr;
        this.index = index;
    }

    @Override
    public int compareTo(HeapItem h) {
        if (arr[index] > h.arr[h.index])
            return 1;
        else if (arr[index] < h.arr[h.index])
            return -1;
        else
            return 0;
    }
}

public class SortKsortedArrays {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 2, 10 }, { 4, 5, 6 }, { 1, 8, 9 } };
        ArrayList<Integer> al = new ArrayList<>();

        PriorityQueue<HeapItem> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(new HeapItem(arr[i], 0));
        }

        while (!pq.isEmpty()) {
            HeapItem current = pq.remove();

            al.add(current.arr[current.index]);

            if(current.index < current.arr.length - 1){
                current.index++;
                pq.add(current);
            }
        }

        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
    }
}
