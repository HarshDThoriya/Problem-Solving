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

public class Floor {

    static int ans = -1;

    static int floor(Node root, int element) {
        int floor = -1;

        while(root != null){
            if(root.data < element){
                floor = root.data;
                root = root.right;
            }
            else {
               root = root.left;
            }
        }

        return floor;
    }

    static void floorRecursive(Node root, int element){
        if(root == null){
            return;
        }

        if(root.data < element){
            ans = root.data;
            floorRecursive(root.right, element);
        }
        else{
            floorRecursive(root.left, element);
        }
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
        root.right.right.left = new Node(13);

        int floor = floor(root, element);
        if (floor == -1) {
            System.out.println("Not Present");
        } else {
            System.out.println("Floor: " + floor);
        }

        floorRecursive(root, element);
        System.out.println(ans);
    }
}
