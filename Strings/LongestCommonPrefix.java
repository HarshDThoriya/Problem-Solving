package Strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};

        if(strs.length == 1){
            System.out.println(strs[0]);
            System.exit(0);
        }

        int minLength = Integer.MAX_VALUE;

        for(int i=0; i<strs.length; i++){
            if(minLength > strs[i].length()){
                minLength = strs[i].length();
            }
        }

        int ans = -1;

        for(int i=0; i<minLength; i++){
            char temp = strs[0].charAt(i);

            for(int j=1; j<strs.length; j++){
                if(temp != strs[j].charAt(i)){
                    ans = i;
                    System.out.println(strs[0].substring(0,ans));
                    System.exit(0);
                }
            }

            ans = i;
        }

        if(ans == -1){
            System.out.println("");
            System.exit(0);
        }

        System.out.println(strs[0].substring(0,ans+1));
        System.exit(0);
    }
}
