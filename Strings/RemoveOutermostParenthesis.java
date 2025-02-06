package Strings;

public class RemoveOutermostParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())";

        int c = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i) == '(' && c != 0){
                sb.append(s.charAt(i));
                c++;
            }
            else if(s.charAt(i) == ')' && c != 1){
                sb.append(s.charAt(i));
                c--;
            }
            else if(s.charAt(i) == '('){
                c++;
            }
            else{
                c--;
            }

            
        }

        System.out.println(sb.toString());
    }
}
