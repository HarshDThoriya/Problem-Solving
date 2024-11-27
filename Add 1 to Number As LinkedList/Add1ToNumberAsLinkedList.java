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

public class Add1ToNumberAsLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedList l1 = new linkedList();
        linkedList head = l1;

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
        
        sc.close();
        
        linkedList prev = null;

        while(head!=null){
            linkedList temp = head.next;
            head.next = prev;
            prev = head;
            head  = temp;
        }

        head = prev;
        
        int carry = 1;
        prev = null;
        
        while(head!=null){
            int d = head.data;
            head.data = (head.data + carry) % 10;
            carry = (d + carry) / 10;
            linkedList temp = head.next;
            head.next = prev; 
            prev = head;
            head = temp;;
        }

        if(carry != 0){
            head = new linkedList(carry, prev);
        }
        
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

    }
}
