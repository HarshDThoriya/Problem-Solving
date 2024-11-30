import java.util.*;

public class Atoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        sc.close();
        int sign = 1;
        int result = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            else if(s.charAt(i) == '-'){
                sign *= -1;
                continue;
            }
            else if(Character.isDigit(s.charAt(i))){
                while(i<s.length()){
                    int digit = s.charAt(i) - '0';

                    if(result > (Integer.MAX_VALUE - digit) / 10){
                        result = (sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
                        break;
                    }
                    result = result * 10 + digit;
                    i++;
                }

                result = sign * result;
            }
        }

        System.out.println(result);
    }
}
