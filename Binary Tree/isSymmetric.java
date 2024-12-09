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

public class isSymmetric {

    boolean isSymmetric(Node root1, Node root2) {
        if(root1 == null || root2 == null){
            return root1 == root2;
        }

        boolean temp1 = isSymmetric(root1.left, root2.right);
        boolean temp2 = isSymmetric(root1.right, root2.left);

        if(temp1 && temp2){
            return root1.data == root2.data;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.right.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);

        isSymmetric isSymmetric = new isSymmetric();
        boolean ans = false;
        if (root == null) {
            ans = true;
        } else {
            ans = isSymmetric.isSymmetric(root.left, root.right);
        }

        System.out.println(ans);
    }
}
