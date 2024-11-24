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

public class FindMiddleOfLinkedList {
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

        linkedList tempHead = head;

        while (tempHead != null) {
            System.out.print(tempHead.data + " ");
            tempHead = tempHead.next;
        }

        System.out.println();

        linkedList slowNode = head;
        linkedList fastNode = head;

        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        System.out.println("Middle Element : " + slowNode.data);
    }
}
