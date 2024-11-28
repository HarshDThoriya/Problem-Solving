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

public class IntersectionOfLinkedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedList l1 = new linkedList();
        linkedList headl1 = l1;

        linkedList l2 = new linkedList();
        linkedList headl2 = l2;

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

        num = sc.nextInt();
        if (num != -1) {
            l2.data = num;
        }
        

        l1 = headl1.next;
        while (true) {
            num = sc.nextInt();

            if(num == -1){
                break;
            }
            l2.next = new linkedList(num);
            l2 = l2.next;
            l1 = l1.next;
        }

        l2.next = l1;
        sc.close();
        
        HashSet<linkedList> hashSet = new HashSet<>();

        while(headl1 != null){
            hashSet.add(headl1);
            headl1 = headl1.next;
        }
        
        while(headl2!=null){
            if(hashSet.contains(headl2)){
                break;
            }
            headl2 = headl2.next;
        }

        System.out.println("Intersection at : "+ headl2.data);

    }
}
