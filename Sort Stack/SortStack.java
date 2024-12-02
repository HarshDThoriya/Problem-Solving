import java.util.*;

public class SortStack {

    static Stack<Integer> stack = new Stack<>();

    static void sortInsert(int x){
        if(stack.isEmpty() || x > stack.peek()){
            stack.push(x);
            return;
        }
        
        int y = stack.pop();
        sortInsert(x);

        stack.push(y);
    }

    static void sort(){
       

        if(!stack.isEmpty()){
            int x = stack.pop();
            
            sort();

            sortInsert(x);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        while(n > 0){
            stack.push(sc.nextInt());
            n--;
        }

        sc.close();

        sort();
        
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
