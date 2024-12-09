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
    static Stack<Node> stack = new Stack<>();

    static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    static void IterativePreOrderTraversal() {
        while (!stack.isEmpty()) {
            Node current = stack.pop();

            System.out.print(current.data + " ");
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
    }

    static void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    static void IterativePostOrderTraversal2Stacks(Node root){
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        Node current = null;
        stack1.push(root);

        while(!stack1.isEmpty()){
            current = stack1.pop();
            
            stack2.push(current);

            if(current.left != null){
                stack1.push(current.left);
            }

            if(current.right != null){
                stack1.push(current.right);
            }
        }

        while(!stack2.isEmpty()){
            System.out.print(stack2.pop().data + " ");
        }
    }

    static void IterativePostOrderTraversal1Stacks(Node root){

    }

    static void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    static void IterativeInOrderTraversal(Node root){
        Node current = root;
        while(!stack.isEmpty() || current != null){
            while(current != null){
                stack.push(current);
                current = current.left;
            }           
            
            current = stack.pop();
            System.out.print(current.data + " ");
            current = current.right;
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
        if (root == null) {
            return 0;
        }

        int lHeight = heightOfBinaryTree(root.left);
        int rHeight = heightOfBinaryTree(root.right);

        return Math.max(lHeight, rHeight) + 1;
    }

    static int isBalancedTree(Node root) {
        if (root == null) {
            return 0;
        }

        int lHeight = isBalancedTree(root.left);
        int rHeight = isBalancedTree(root.right);

        if (lHeight == -1 || rHeight == -1) {
            return -1;
        }

        if (Math.abs(lHeight - rHeight) > 1) {
            return -1;
        }

        return Math.max(lHeight, rHeight) + 1;
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
        stack.push(root);
        System.out.println();
        IterativePreOrderTraversal();

        System.out.println();
        postOrderTraversal(root);
        System.out.println();
        IterativePostOrderTraversal2Stacks(root);
        System.out.println();
        IterativePostOrderTraversal1Stacks(root);
        System.out.println();

        inOrderTraversal(root);
        stack.clear();
        System.out.println();
        IterativeInOrderTraversal(root);
        

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
