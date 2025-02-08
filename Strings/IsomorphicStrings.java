package Strings;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s  = "paper";
        String t = "titre";

        HashMap<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (charMap.containsKey(sc)) {
                if (charMap.get(sc) != tc) {
                    System.out.println("False");
                    System.exit(0);
                }
            } else if (charMap.containsValue(tc)) {
                System.out.println("False");
                    System.exit(0);
            }

            charMap.put(sc, tc);
        }

        System.out.println("True");
    }
}
