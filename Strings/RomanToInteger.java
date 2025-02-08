package Strings;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "XIV";
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int count = 0;
        int sum = 0;

        while(count < s.length()-1){
            if(map.get(s.charAt(count)) < map.get(s.charAt(count+1))){
                sum = sum + map.get(s.charAt(count+1)) - map.get(s.charAt(count));
                count++; 
            }
            else{
                sum+=map.get(s.charAt(count));
            }
            count++;
        }

        System.out.println(count);

        if(count <= s.length()-1){
            sum+=map.get(s.charAt(count));
        }

        System.out.println(sum);
    }
}
