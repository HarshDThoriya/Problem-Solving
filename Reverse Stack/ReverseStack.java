import java.util.*;

public class ReverseStack {

    static Stack<Integer> stack = new Stack<>();

    static void reverse(){
        int x = stack.pop();
        if(!stack.isEmpty()){
            reverse();
        }

        stack.push(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        while(n > 0){
            stack.push(sc.nextInt());
            n--;
        }

        sc.close();

        reverse();

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
