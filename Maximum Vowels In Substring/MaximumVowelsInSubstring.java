import java.util.*;

public class MaximumVowelsInSubstring {

    static boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int k = sc.nextInt();
        
        sc.close();
        str = str.trim();

        int maxVowels = 0;

        for(int i=0; i<k; i++){
            if(isVowel(str.charAt(i))){
                maxVowels++;
            }
        }

        int j = k;
        int i = 1;

        int currentMax = maxVowels;

        while (j<str.length()) {
            if(isVowel(str.charAt(i-1))){
                currentMax --;
            }
            if(isVowel(str.charAt(j))){
                currentMax++;
            }
            if(currentMax>maxVowels){
                maxVowels = currentMax;
            }
            i++;
            j++;
        }

        System.out.println(maxVowels);
    }
}
