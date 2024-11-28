import java.util.*;

class linkedList {
    int data;
    linkedList next;

    linkedList() {

    }

    linkedList(int data) {
        this.data = data;
        this.next = null;
    }

    linkedList(int data, linkedList next) {
        this.data = data;
        this.next = next;
    }
}

public class SortLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedList list = new linkedList();
        linkedList head = list;

        int num = 0;

        num = sc.nextInt();
        if (num != -1) {
            list.data = num;
        }

        while (true) {
            num = sc.nextInt();
            if(num == -1){
                break;
            }
            list.next = new linkedList(num);
            list = list.next;
        }

        sc.close();
        
        linkedList l1 = new linkedList();
        linkedList headl1 = l1;
        linkedList l0 = new linkedList();
        linkedList headl0 = l0;
        linkedList l2 = new linkedList();
        linkedList headl2 = l2;

        while(head!=null){
            if(head.data == 0){
                l0.next = new linkedList();
                l0 = l0.next;
                l0.data = 0;
                head = head.next;
                continue;
            }
            if(head.data == 2){
                l2.next = new linkedList();
                l2 = l2.next;
                l2.data = 2;
                head = head.next;
                continue;
            }
            if(head.data == 1){
                l1.next = new linkedList();
                l1 = l1.next;
                l1.data = 1;
                head = head.next;
                continue;
            }
        }

        l1.next = headl2.next;
        l0.next = headl1.next != null ? headl1.next : headl2.next;
        l2.next = null;

        headl0 = headl0.next;

        while(headl0!=null){
            System.out.print(headl0.data+" ");
            headl0 = headl0.next;
        }
    }
}
