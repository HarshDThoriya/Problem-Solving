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
}

public class AddTwoAsLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedList l1 = new linkedList();
        linkedList l2 = new linkedList();
        linkedList headOfl1 = l1;
        linkedList headOfl2 = l2;

        int num = 0;

        num = sc.nextInt();
        if (num != -1) {
            l1.data = num;
        }

        while (true) {
            num = sc.nextInt();
            if(num == -1){
                break;
            }
            l1.next = new linkedList(num);
            l1 = l1.next;
        }

        num = 0;

        num = sc.nextInt();
        if (num != -1) {
            l2.data = num;
        }

        while (true) {
            num = sc.nextInt();
            if(num == -1){
                break;
            }
            l2.next = new linkedList(num);
            l2 = l2.next;
        }

        l1 = headOfl1;
        l2 = headOfl2;

        linkedList sum = new linkedList();
        linkedList headOfSum = sum;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int d1 = 0, d2 = 0;
            if (l1 != null) {
                d1 = l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                d2 = l2.data;
                l2 = l2.next;
            }

            sum.next = new linkedList((d1 + d2 + carry) % 10);
            carry = (d1 + d2 + carry )/ 10;
            sum = sum.next;
        }

        headOfSum =headOfSum.next;

        while (headOfSum != null) {
            System.out.print(headOfSum.data + " ");
            headOfSum = headOfSum.next;
        }
    }
}
