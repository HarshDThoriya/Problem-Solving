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

public class MaxSumPath {
    static int max = 0;

    static int maxPathSum(Node root) {
        if (root == null) {
            return 0;
        }

        int lSum = maxPathSum(root.left);
        int rSum = maxPathSum(root.right);

        max = Math.max(max, lSum + rSum + root.data);

        return (Math.max(rSum, lSum) + (root.data > 0 ? root.data : 0));
    }

    public static void main(String[] args) {
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);
        // root.left.right.left = new Node(8);
        // root.right.right.left = new Node(9);
        // root.right.right.right = new Node(10);

        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        maxPathSum(root);

        System.out.println(max);
    }
}
