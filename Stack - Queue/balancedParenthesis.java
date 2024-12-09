import java.util.*;

public class balancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(!stack.isEmpty() && ((stack.peek() == '(' && str.charAt(i) == ')') || (stack.peek() == '{' && str.charAt(i) == '}') || (stack.peek() == '[' && str.charAt(i) == ']'))){
                stack.pop();
            }
            else{
                stack.push(str.charAt(i));
            }
        }

        if(stack.isEmpty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }    
}
