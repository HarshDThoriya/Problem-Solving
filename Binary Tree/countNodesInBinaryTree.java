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

public class countNodesInBinaryTree {
    static int rHeight = 0;
    static int lHeight = 0;

    static void leftHeight(Node root){
        if(root == null){
            return;
        }
        lHeight++;
        leftHeight(root.left);

    }
    
    static void rightHeight(Node root){
        if(root == null){
            return;
        }
        rHeight++;
        leftHeight(root.right);

    }

    static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        leftHeight(root);
        rightHeight(root);
        if(lHeight == rHeight){
            return ((1<<lHeight) - 1);
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    
    public static void main(String[] args) {
       Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println(countNodes(root));
    }    
}


