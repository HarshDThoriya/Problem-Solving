package Strings;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String num = "35427";

        for(int i=num.length()-1; i>=0; i--){
            if(num.charAt(i) % 2 == 1){
                System.out.println(num.substring(0,i+1));
                System.exit(0);
            }
        }

        System.out.println("");
    }
}
