package Strings;

public class MaxNestingDepth {
    public static void main(String[] args) {
        String s = "(((())))()()((((((() () ()))))))";
        int max = 0;

        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
                max = Math.max(max, count);
            }
            else if(s.charAt(i) == ')'){
                count--;
            }
        }

        System.out.println(max);
    }
}
