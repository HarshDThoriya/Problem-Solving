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

public class Ceil {
    static int ans = -1;
    static int ceil(Node root, int element) {
        int ceil = -1;
        if (root.data == element) {
            ceil = root.data;
            return ceil;
        }

        while (root != null) {
            if (root.data >= element) {
                ceil = root.data;
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return ceil;
    }

    static void ceilRecursive(Node root, int element){
        if(root == null){
            return;
        }

        if(root.data == element){
            ans = root.data;
            return;
        }

        if(root.data > element){
            ans = root.data;
            ceilRecursive(root.left, element);
        }
        else{
            ceilRecursive(root.right, element);
        }
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

        int ceil = ceil(root, element);
        if (ceil == -1) {
            System.out.println("Not Present");
        } else {
            System.out.println("Ceiling: " + ceil);
        }

        ceilRecursive(root,element);
        System.out.println(ans);
    }
}
