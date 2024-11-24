import java.util.*;

public class RemoveStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        sc.close();

        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder("");
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '*'){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        System.out.println(sb.reverse().toString());
    }
}
