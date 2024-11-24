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

public class OddEvenLinkedList {
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

        if (head == null || head.next == null) {
            System.out.println("null");
        }

        linkedList odd = head;
        linkedList even = head.next;
        linkedList evenHead = even;

        while(odd.next != null && even.next!= null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }

        odd.next = evenHead;

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
