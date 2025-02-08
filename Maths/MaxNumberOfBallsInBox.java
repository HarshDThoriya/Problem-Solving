package Maths;

import java.util.HashMap;

public class MaxNumberOfBallsInBox {

    static int getSum(int n)
    {
        int sum = 0;

        while(n > 0)
        {
            sum += (n % 10); 
            n /= 10;         
        }

        return sum;
    }

    public static void main(String[] args) {
        int lowLimit = 1, highLimit = 10;

        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;

        for(int i=lowLimit; i<=highLimit; i++){
            int temp = getSum(i);
            if(map.containsKey(temp)){
                map.compute(temp, (key, value) -> value+1);
            }
            else{
                map.put(temp, 1);
            }

            max = Math.max(max, map.get(temp));
        }

        System.out.println(max);
    }
}
