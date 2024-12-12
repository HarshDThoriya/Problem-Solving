import java.util.*;

class RecentCounter {

    Queue<Integer> queue = new LinkedList<>();
    int end;
    public RecentCounter() {
        end = 0;
    }
    
    public int ping(int t) {
        while(!queue.isEmpty() && t - queue.peek() > 3000){
            queue.poll();
        }

        queue.add(t);
        return queue.size();
    }
}

public class NumberOfRecentCalls {
    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        System.out.println(obj.ping(1));
        System.out.println(obj.ping(100));
        System.out.println(obj.ping(3001));
        System.out.println(obj.ping(3002));
    }    
}
