
import java.util.*;

class linkedList {
    linkedList next;
    long data;

    linkedList() {

    }

    linkedList(long data) {
        this.next = null;
        this.data = data;
    }
}

public class MaximumTwinSumOfLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        linkedList head = new linkedList();
        linkedList current = new linkedList();
        if (num != -1) {
            head.data = num;
            head.next = null;
            current = head;
        } else {
            System.out.println("No Elements");
        }

        while (true) {
            num = sc.nextLong();
            if (num == -1) {
                break;
            }
            current.next = new linkedList(num);
            current = current.next;
        }

        sc.close();

        if (head == null || head.next == null) {
            System.out.println("null");
        }

        linkedList slow = head;
        linkedList fast = head;

        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        linkedList prev = null;
        while(slow!=null){
           linkedList front = slow.next;
            slow.next = prev;
            prev = slow;
            slow = front;
        }

        slow = prev;

        long max = Integer.MIN_VALUE;

        while(slow!= null && head!= null){
            if(max < (slow.data + head.data)){
                max = slow.data + head.data;
            }
            slow = slow.next;
            head = head.next;
        }

        System.out.println(max);

    }
}
