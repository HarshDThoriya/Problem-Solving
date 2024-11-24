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

public class ReverseLinkedList {
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


        linkedList prev = null;
        
        while(head!=null){
            linkedList front = head.next;
            head.next = prev;
            prev = head;
            head = front;
        }

        head = prev;

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
