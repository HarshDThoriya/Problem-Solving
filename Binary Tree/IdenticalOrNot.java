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

public class IdenticalOrNot {
    static Queue<Node> queue1 = new LinkedList<>();
    static Queue<Node> queue2 = new LinkedList<>();


    static boolean identicalOrNot(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        else if(root1 == null && root2 != null){
            return false;
        }
        else if(root2 == null && root1 != null){
            return false;
        }

        queue1.add(root1);
        queue2.add(root2);

        while(!queue1.isEmpty() && !queue2.isEmpty()){
            Node temp1 = queue1.poll();
            Node temp2 = queue2.poll();

            if(temp1.data != temp2.data){
                return false;
            }

            if(temp1.left!= null && temp2.left!=null){
                queue1.add(temp1.left);
                queue2.add(temp2.left);
            }
            else if(temp1.left!= null || temp2.left!=null){
                return false;
            }

            if(temp1.right != null && temp2.right!=null){
                queue1.add(temp1.right);
                queue2.add(temp2.right);
            }
            else if(temp1.right != null || temp2.right!=null){
                return false;
            }
        }
        return true;
    }

    static boolean recursiveIdenticalOrNot(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }

        if(root1 == null || root2 == null){
            return false;
        }

        return (root1.data == root2.data && recursiveIdenticalOrNot(root1.left, root2.left) && recursiveIdenticalOrNot(root1.right, root2.right));
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

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.right.left = new Node(6);
        root2.right.right = new Node(7);
        root2.left.right.left = new Node(8);
        root2.right.right.left = new Node(9);
        root2.right.right.right = new Node(10);

        
        System.out.println(identicalOrNot(root, root2));
        System.out.println(recursiveIdenticalOrNot(root, root2));

    }
}
