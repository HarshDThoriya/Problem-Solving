import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class RootToNodePath {
    static Stack<Node> stack = new Stack<>();

    static Node rootToNodePath(Node root, int value) {
        if (root == null) {
            return null;
        }

        if (root.data == value) {
            stack.push(root);
            return root;
        }

        Node ans = rootToNodePath(root.left, value);

        if(ans != null){
            stack.push(root);
        }
        else{
            ans = rootToNodePath(root.right, value);

            if(ans != null){
                stack.push(root);
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        // Node root = new Node(3);
        // root.left = new Node(5);
        // root.right = new Node(1);
        // root.left.left = new Node(6);
        // root.left.right = new Node(2);
        // root.right.left = new Node(0);
        // root.right.right = new Node(8);
        // root.left.right.left = new Node(7);
        // root.left.right.right = new Node(4);

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

        rootToNodePath(root, 4);

        while(!stack.isEmpty()){
            System.out.println(stack.pop().data + " ");
        }
    }
}
