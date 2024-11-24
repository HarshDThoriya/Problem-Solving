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

public class DeleteMiddleOfLinkedList {
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

        linkedList slow = head;
        linkedList fast = head;
        linkedList prev = null;

        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
