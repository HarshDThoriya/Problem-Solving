import java.util.*;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        sc.close();

        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String charAsString = String.valueOf(c);
            StringBuilder temp = new StringBuilder();
            if (c != ']') {
                stack.push(charAsString);
            } else {
                while ((!stack.isEmpty()) && stack.peek().toCharArray()[0] != '[') {
                    temp.append(stack.pop());
                }
                
                stack.pop();

                int count = 0;
                int dec = 1;

                while (!stack.isEmpty() && Character.isDigit(stack.peek().toCharArray()[0])) {
                    count = count + dec * Integer.parseInt(stack.peek());
                    dec = dec * 10;
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == "[") {
                    for (int k = 0; k < count; k++) {
                        
                        temp = temp.reverse();
                        sb.append(temp);
                    }
                } else {
                    String t = temp.toString();
                    while (--count > 0) {
                        temp.append(t);
                    }
                    if (!stack.isEmpty()) {
                        stack.push(temp.toString());
                    } else {
                    temp = temp.reverse();
                        sb.append(temp);
                    }
                }
            }
        }

        StringBuilder temp = new StringBuilder();
        while(!stack.isEmpty()){
            temp.append(stack.pop());
        }

        sb.append(temp.reverse());
        
        System.out.println(sb.toString());
    }
}
