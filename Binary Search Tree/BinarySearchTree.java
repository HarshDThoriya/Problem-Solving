import java.util.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {

    static boolean searchElementRecursion(Node root, int element) {
        if (root == null) {
            return false;
        }

        if (root.data != element) {
            if (root.data > element) {
                boolean temp = searchElementRecursion(root.left, element);
                return temp;
            } else {
                boolean temp = searchElementRecursion(root.right, element);
                return temp;
            }
        } else {
            return true;
        }
    }

    static boolean searchElementIteration(Node root, int element){
        while(root!=null && root.data != element){
            if(root.data > element){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }

        return root == null ? false : true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();

        sc.close();

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(12);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.left.right.left = new Node(6);
        root.right.left = new Node(10);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);

        boolean found = searchElementRecursion(root, element);
        found = searchElementIteration(root, element);

        if (found) {
            System.out.println("Element Present");
        } else {
            System.out.println("Element Absent");
        }

    }
}
