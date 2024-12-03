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

public class BinaryTree {

    static Queue<Node> queue = new LinkedList<>();

    static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    static void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    static void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    static void levelOrderTraversal() {
        Node root = null;
        if (!queue.isEmpty()) {
            root = queue.poll();
            System.out.print(root.data + " ");
        } else {
            return;
        }

        if (root != null && root.left != null) {
            queue.add(root.left);
        }

        if (root != null && root.right != null) {
            queue.add(root.right);
        }

        levelOrderTraversal();
    }

    static int heightOfBinaryTree(Node root) {
        if(root == null){
            return 0;
        }

        int lHeight = isBalancedTree(root.left);
        int rHeight = isBalancedTree(root.right);

        return Math.max(lHeight,rHeight)+1;
    }

    static int isBalancedTree(Node root){
        if(root == null){
            return 0;
        }

        int lHeight = isBalancedTree(root.left);
        int rHeight = isBalancedTree(root.right);

        if(lHeight == -1 || rHeight == -1){
            return -1;
        } 

        if(Math.abs(lHeight - rHeight) > 1){
            return -1;
        }

        return Math.max(lHeight,rHeight)+1;
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

        preOrderTraversal(root);
        System.out.println();
        postOrderTraversal(root);
        System.out.println();
        inOrderTraversal(root);
        System.out.println();
        queue.add(root);
        levelOrderTraversal();

        int height = heightOfBinaryTree(root);
        System.out.println();
        System.out.println(height);

        int isBalanced = isBalancedTree(root);

        System.out.println(isBalanced == -1 ? "Imbalanced" : "Balanced");
    }
}
