package Strings;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaras";

        if(s.length() != t.length()){
            System.out.println("False");
            System.exit(0);
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i=0; i<t.length(); i++){
            if(map.get(t.charAt(i)) == null || map.get(t.charAt(i)) == 0){
                System.out.println("False");
                System.exit(0);
            }
            else{
                map.compute(t.charAt(i), (key,value) -> value-1);
            }
        }

        System.out.println("True");
    }
}
