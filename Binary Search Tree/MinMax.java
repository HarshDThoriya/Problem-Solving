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

public class MinMax {
    static int Max(Node root){
        while(true){
            if(root.right != null){
                root = root.right;
            }
            else{
                break;
            }
        }

        return root.data;
    }

    static int Min(Node root){
        while(true){
            if(root.left != null){
                root = root.left;
            }
            else{
                break;
            }
        }
        return root.data;
    }
    
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(12);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.left.right.left = new Node(6);
        root.right.left = new Node(10);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);

        System.out.println("Max: " + Max(root));
        System.out.println("Min: " + Min(root));
    }
}
