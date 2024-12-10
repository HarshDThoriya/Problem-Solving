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

public class Diameter {
    static int max = 0;

    static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int lHeight = diameter(root.left);
        int rHeight = diameter(root.right);

        max = Math.max(max, lHeight + rHeight);

        return 1 + Math.max(lHeight, rHeight);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.right.left = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        diameter(root);
        System.out.println(max);

    }
}
