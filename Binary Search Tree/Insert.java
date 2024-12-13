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

public class Insert {
    static Queue<Node> queue = new LinkedList<>();

    static void insert(Node root, int element) {
        Node temp = null;
        Node newNode = new Node(element);
        while (root != null) {
            temp = root;
            if (root.data > element) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        if (temp == null) {
            root = null;
        } else if (temp.data > element) {
            temp.left = newNode;
        } else {
            temp.right = newNode;
        }

    }

    static void Inorder(Node root) {
        if (root == null)
            return;
        else {
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
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
        root.right.right.right = new Node(15);
        root.right.right.left = new Node(13);

        insert(root, element);

        Inorder(root);
        queue.add(root);
        System.out.println();
        levelOrderTraversal();
    }
}
